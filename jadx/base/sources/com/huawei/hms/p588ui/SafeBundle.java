package com.huawei.hms.p588ui;

import android.os.Bundle;
import com.huawei.hms.base.p575ui.C17740a;

/* JADX INFO: loaded from: classes9.dex */
public class SafeBundle {

    /* JADX INFO: renamed from: a */
    public final Bundle f56980a;

    public SafeBundle() {
        this(new Bundle());
    }

    public boolean containsKey(String str) {
        try {
            return this.f56980a.containsKey(str);
        } catch (Exception unused) {
            C17740a.m75842a("SafeBundle", "containsKey exception. key:");
            return false;
        }
    }

    public Object get(String str) {
        try {
            return this.f56980a.get(str);
        } catch (Exception e) {
            C17740a.m75843a("SafeBundle", "get exception: " + e.getMessage(), true);
            return null;
        }
    }

    public Bundle getBundle() {
        return this.f56980a;
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public String getString(String str) {
        try {
            return this.f56980a.getString(str);
        } catch (Exception e) {
            C17740a.m75843a("SafeBundle", "getString exception: " + e.getMessage(), true);
            return "";
        }
    }

    public boolean isEmpty() {
        try {
            return this.f56980a.isEmpty();
        } catch (Exception unused) {
            C17740a.m75842a("SafeBundle", "isEmpty exception");
            return true;
        }
    }

    public int size() {
        try {
            return this.f56980a.size();
        } catch (Exception unused) {
            C17740a.m75842a("SafeBundle", "size exception");
            return 0;
        }
    }

    public String toString() {
        return this.f56980a.toString();
    }

    public SafeBundle(Bundle bundle) {
        this.f56980a = bundle == null ? new Bundle() : bundle;
    }

    public int getInt(String str, int i) {
        try {
            return this.f56980a.getInt(str, i);
        } catch (Exception e) {
            C17740a.m75843a("SafeBundle", "getInt exception: " + e.getMessage(), true);
            return i;
        }
    }

    public String getString(String str, String str2) {
        try {
            return this.f56980a.getString(str, str2);
        } catch (Exception e) {
            C17740a.m75843a("SafeBundle", "getString exception: " + e.getMessage(), true);
            return str2;
        }
    }
}
