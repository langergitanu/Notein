package com.huawei.cloud.services.drive.model;

import com.huawei.cloud.base.json.GenericJson;
import com.huawei.cloud.base.util.Key;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class ResumeResBody extends GenericJson {

    @Key
    private Integer processTime;

    @Key
    private List<String> rangeList;

    @Key
    private Integer sliceSize;

    public Integer getProcessTime() {
        return this.processTime;
    }

    public List<String> getRangeList() {
        return this.rangeList;
    }

    public Integer getSliceSize() {
        return this.sliceSize;
    }

    public void setProcessTime(Integer num) {
        this.processTime = num;
    }

    public void setRangeList(List<String> list) {
        this.rangeList = list;
    }

    public void setSliceSize(int i) {
        this.sliceSize = Integer.valueOf(i);
    }
}
