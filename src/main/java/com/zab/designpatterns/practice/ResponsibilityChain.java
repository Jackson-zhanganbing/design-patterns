package com.zab.designpatterns.practice;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;

public class ResponsibilityChain {
    public static void main(String[] args) {
        String source = "大家好，我是996，<script>fuck!!!!!!!!!!!!<script>";

        Request request = new Request(source);
        Response response = new Response(source);


        ResonsibilityChain chain1 = new ResonsibilityChain();
        chain1.addFilter(new SensitiveFilter()).addFilter(new NineNineSixFilter());

        ResonsibilityChain chain2 = new ResonsibilityChain();
        chain2.addFilter(new CodeFilter()).addFilter(new RepeatableFilter()).addFilter(chain1);


        chain2.doFilter(request, response, chain2);

        System.out.println(request.getData());
    }


}

class ResonsibilityChain implements Filter {
    List<Filter> filterList = new LinkedList<>();
    public int index = 0;

    ResonsibilityChain addFilter(Filter filter) {
        filterList.add(filter);
        return this;
    }

    @Override
    public Filter doFilter(Request request, Response response, ResonsibilityChain chain) {
        if (index == filterList.size()) {
            return this;
        }

        Filter filter = filterList.get(index);
        index++;
        filter.doFilter(request, response, this);
        return this;
    }
}

interface Filter {
    Filter doFilter(Request request, Response response, ResonsibilityChain chain);
}

class SensitiveFilter implements Filter {
    @Override
    public Filter doFilter(Request request, Response response, ResonsibilityChain chain) {
        String data = request.getData().replaceAll("fuck", "****");
        request.setData(data);

        chain.doFilter(request, response, chain);

        data = response.getData().replaceAll("fuck", "****|response");
        response.setData(data);
        return this;
    }
}

class NineNineSixFilter implements Filter {
    @Override
    public Filter doFilter(Request request, Response response, ResonsibilityChain chain) {
        String data = request.getData().replaceAll("996", "早九晚五");
        request.setData(data);
        chain.doFilter(request, response, chain);

        data = response.getData().replaceAll("996", "早九晚五|response");
        response.setData(data);


        return this;
    }
}

class CodeFilter implements Filter {
    @Override
    public Filter doFilter(Request request, Response response, ResonsibilityChain chain) {
        String data = request.getData().replaceAll("<", "[").replaceAll(">", "]");
        request.setData(data);
        chain.doFilter(request, response, chain);

        data = response.getData().replaceAll("<", "[").replaceAll(">", "]|response");
        response.setData(data);

        return this;
    }
}

class RepeatableFilter implements Filter {
    @Override
    public Filter doFilter(Request request, Response response, ResonsibilityChain chain) {
        String data = request.getData().replaceAll("!!!!!!!!!!!!", "!");
        request.setData(data);
        chain.doFilter(request, response, chain);

        data = response.getData().replaceAll("!!!!!!!!!!!!", "!|response");
        response.setData(data);
        return this;
    }
}

@Data
class Request {
    public Request(String data) {
        this.data = data;
    }

    private String data;

}

@Data
class Response {
    public Response(String data) {
        this.data = data;
    }

    private String data;
}

class Msg {

    private String name;
    private String data;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "name='" + name + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}