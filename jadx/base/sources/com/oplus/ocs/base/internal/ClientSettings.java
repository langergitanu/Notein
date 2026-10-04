package com.oplus.ocs.base.internal;

import com.oplus.ocs.base.common.Feature;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ClientSettings {

    /* JADX INFO: renamed from: a */
    private String f57550a;

    /* JADX INFO: renamed from: b */
    private int f57551b;

    /* JADX INFO: renamed from: c */
    private List<Feature> f57552c;

    public ClientSettings(String str) {
        this.f57550a = str;
        this.f57551b = 100011;
        this.f57552c = new ArrayList();
    }

    public List<Feature> getList() {
        return this.f57552c;
    }

    public String getPackageName() {
        return this.f57550a;
    }

    public int getVersionCode() {
        return this.f57551b;
    }

    public ClientSettings(String str, int i, List<Feature> list) {
        this.f57550a = str;
        this.f57551b = i;
        this.f57552c = list;
    }
}
