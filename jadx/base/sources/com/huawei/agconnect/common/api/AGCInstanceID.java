package com.huawei.agconnect.common.api;

import android.content.Context;
import com.huawei.agconnect.credential.obs.C17625c;
import com.huawei.agconnect.credential.obs.C17626d;
import com.huawei.agconnect.credential.obs.C17627e;

/* JADX INFO: loaded from: classes8.dex */
public class AGCInstanceID {
    private final C17627e preferences;
    private final C17626d wrapper;

    private AGCInstanceID(Context context) {
        this.wrapper = new C17626d(context);
        this.preferences = new C17627e(context, C17625c.f52154a);
    }

    public static AGCInstanceID getInstance(Context context) {
        return new AGCInstanceID(context);
    }

    public void deleteAAID() {
        if (this.wrapper.m75529a()) {
            this.wrapper.m75532d();
        } else if (this.preferences.m75548e(C17625c.f52154a)) {
            this.preferences.m75549f(C17625c.f52154a);
            this.preferences.m75549f(C17625c.f52155b);
        }
    }

    public long getCreationTime() {
        if (this.wrapper.m75529a()) {
            return this.wrapper.m75531c();
        }
        try {
            if (!this.preferences.m75548e(C17625c.f52155b)) {
                getId();
            }
            return this.preferences.m75547d(C17625c.f52155b);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public String getId() {
        return this.wrapper.m75529a() ? this.wrapper.m75530b() : C17625c.m75524a(this.preferences);
    }
}
