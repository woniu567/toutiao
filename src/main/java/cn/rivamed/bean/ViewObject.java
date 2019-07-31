package cn.rivamed.bean;

import java.util.HashMap;
import java.util.Map;

public class ViewObject {

    private Map<String,Object> objs = new HashMap<String,Object>();

    public Map<String, Object> getObjs() {
        return objs;
    }

    public void setObjs(Map<String, Object> objs) {
        this.objs = objs;
    }
}
