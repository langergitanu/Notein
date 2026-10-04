package o0OOoo0O;

import java.io.File;
import o0O0oooO.AbstractApplicationC26277OooOoOO;

/* JADX INFO: renamed from: o0OOoo0O.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27848OooOOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f98391OooO00o;

    public C27848OooOOo0(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        this.f98391OooO00o = abstractApplicationC26277OooOoOO;
    }

    public final File OooO00o(String str) {
        return new File(this.f98391OooO00o.getFilesDir(), com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("my_templates/material_", str));
    }
}
