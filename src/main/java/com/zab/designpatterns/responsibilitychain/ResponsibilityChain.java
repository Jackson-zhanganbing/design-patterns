package com.zab.designpatterns.responsibilitychain;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;

public class ResponsibilityChain{
    public static void main(String[] args) {
        String source = "大家好，我是996，<script>fuck :)<script>";
        Request request = new Request(source);
        Response response = new Response(source);

        //1、996 过滤为955
        //2、js过滤
        //3、fuck ****
        //4、:)
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new NineNineSixFilter()).addFilter(new JsFilter())
                .addFilter(new SensitiveFilter()).addFilter(new FaceFilter());
        filterChain.doFilter(request,response,filterChain);
        System.out.println(request.getData());
    }
}

@Data
class Request{
    public Request(String data) {
        this.data = data;
    }

    private String data;
}
@Data
class Response{
    public Response(String data) {
        this.data = data;
    }

    private String data;
}


class FilterChain implements Filter{
    List<Filter> filters = new LinkedList<>();
    public int index = 0;
    public FilterChain addFilter(Filter filter){
        filters.add(filter);
        return this;
    }
    @Override
    public boolean doFilter(Request request,Response response,Filter filter) {
        if(index == filters.size()){
            return false;
        }
        Filter filter1 = filters.get(index);
        index++;
        return filter1.doFilter(request,response,this);
    }
}
interface Filter{
    boolean doFilter(Request request,Response response,Filter filter);
}
class NineNineSixFilter implements Filter{
    @Override
    public boolean doFilter(Request request,Response response,Filter filter) {
        request.setData(request.getData().replaceAll("996","955"));
        filter.doFilter(request,response,filter);
        response.setData(response.getData().replaceAll("996","955"));
        return true;
    }
}
class JsFilter implements Filter{
    @Override
    public boolean doFilter(Request request,Response response,Filter filter) {
        request.setData(request.getData().replaceAll("<","[").replaceAll(">","]"));
        filter.doFilter(request,response,filter);
        response.setData(response.getData().replaceAll("<","[").replaceAll(">","]"));
        return true;
    }
}
class SensitiveFilter implements Filter{
    @Override
    public boolean doFilter(Request request,Response response,Filter filter) {
        if (request.getData().contains("fuck")){
            return false;
        }
        request.setData(request.getData().replaceAll("fuck","****"));
        filter.doFilter(request,response,filter);
        response.setData(response.getData().replaceAll("fuck","****"));
        return true;
    }
}
class FaceFilter implements Filter{
    @Override
    public boolean doFilter(Request request,Response response,Filter filter) {
        request.setData(request.getData().replaceAll(":\\)","^v^"));
        filter.doFilter(request,response,filter);
        response.setData(response.getData().replaceAll(":\\)","^v^"));
        return true;
    }
}

@Data
class Msg{
    private String name;
    private String data;

}

