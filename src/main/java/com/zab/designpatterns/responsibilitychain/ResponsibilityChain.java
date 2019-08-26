package com.zab.designpatterns.responsibilitychain;

import java.util.LinkedList;
import java.util.List;

public class ResponsibilityChain {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setName("一则消息");
        msg.setData("大家好，我是<script>，fuck！！！ 996!!! ");
        System.out.println(msg);

        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new CodeFilter()).addFilter(new SensitiveFilter());

        FilterChain filterChain1 = new FilterChain();
        filterChain1.addFilter(new NnsFilter()).addFilter(new RepeatFilter()).addFilter(filterChain);
        filterChain1.doFilter(msg);

        System.out.println(msg);
    }
}

interface Filter{
    Msg doFilter(Msg msg);
}

class CodeFilter implements Filter{
    @Override
    public Msg doFilter(Msg msg) {
        String data = msg.getData();
        String codeFilter = data.replaceAll("<","[").replaceAll(">","]");
        msg.setData(codeFilter);
        return msg;
    }
}

class SensitiveFilter implements Filter{
    @Override
    public Msg doFilter(Msg msg) {
        String data = msg.getData();
        String sensitiveFilter = data.replaceAll("fuck","***");
        msg.setData(sensitiveFilter);
        return msg;
    }
}

class NnsFilter implements Filter{
    @Override
    public Msg doFilter(Msg msg) {
        String data = msg.getData();
        String nnsFilter = data.replaceAll("996","朝九晚五");
        msg.setData(nnsFilter);
        return msg;
    }
}

class RepeatFilter implements Filter{
    @Override
    public Msg doFilter(Msg msg) {
        String data = msg.getData();
        String repeatFilter = data.replaceAll("!!!","!");
        msg.setData(repeatFilter);
        return msg;
    }
}

class FilterChain implements Filter{

    List<Filter> filters = new LinkedList<>();

    public FilterChain addFilter(Filter filter){
        filters.add(filter);
        return this;
    }

    @Override
    public Msg doFilter(Msg msg) {
        for (Filter filter: filters) {
            filter.doFilter(msg);
        }
        return msg;
    }
}



class Msg{
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
