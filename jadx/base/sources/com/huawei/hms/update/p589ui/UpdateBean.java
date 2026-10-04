package com.huawei.hms.update.p589ui;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class UpdateBean implements Serializable {

    /* JADX INFO: renamed from: a */
    public boolean f56987a;

    /* JADX INFO: renamed from: b */
    public String f56988b;

    /* JADX INFO: renamed from: c */
    public ArrayList f56989c;

    /* JADX INFO: renamed from: d */
    public boolean f56990d = true;

    /* JADX INFO: renamed from: a */
    public static <T> T m80187a(T t) {
        return t;
    }

    public String getClientAppName() {
        return (String) m80187a(this.f56988b);
    }

    public boolean getResolutionInstallHMS() {
        return this.f56987a;
    }

    public ArrayList getTypeList() {
        return (ArrayList) m80187a(this.f56989c);
    }

    public boolean isNeedConfirm() {
        return ((Boolean) m80187a(Boolean.valueOf(this.f56990d))).booleanValue();
    }

    public void setClientAppId(String str) {
    }

    public void setClientAppName(String str) {
        this.f56988b = str;
    }

    public void setClientPackageName(String str) {
    }

    public void setClientVersionCode(int i) {
    }

    public void setHmsOrApkUpgrade(boolean z) {
    }

    public void setNeedConfirm(boolean z) {
        this.f56990d = z;
    }

    public void setResolutionInstallHMS(boolean z) {
        this.f56987a = z;
    }

    public void setTypeList(ArrayList arrayList) {
        this.f56989c = arrayList;
    }
}
