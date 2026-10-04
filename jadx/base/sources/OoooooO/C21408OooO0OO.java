package OoooooO;

import java.util.ArrayList;
import java.util.List;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: OoooooO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21408OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final List<? extends AbstractC21410OooO0o> f61950OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f61951OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f61952OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f61953OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f61954OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f61955OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f61956OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f61957OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float f61958OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final List<AbstractC21459OoooO0O> f61959OooOO0;

    public C21408OooO0OO() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
    }

    public C21408OooO0OO(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List clipPathData, int i) {
        str = (i & 1) != 0 ? "" : str;
        f = (i & 2) != 0 ? 0.0f : f;
        f2 = (i & 4) != 0 ? 0.0f : f2;
        f3 = (i & 8) != 0 ? 0.0f : f3;
        f4 = (i & 16) != 0 ? 1.0f : f4;
        f5 = (i & 32) != 0 ? 1.0f : f5;
        f6 = (i & 64) != 0 ? 0.0f : f6;
        f7 = (i & 128) != 0 ? 0.0f : f7;
        if ((i & 256) != 0) {
            int i2 = C21457OoooO0.f62122OooO00o;
            clipPathData = C34434OooOoO.f123453OooOo0o;
        }
        ArrayList arrayList = new ArrayList();
        kotlin.jvm.internal.OooOOO0.OooO0oO(clipPathData, "clipPathData");
        this.f61951OooO00o = str;
        this.f61952OooO0O0 = f;
        this.f61953OooO0OO = f2;
        this.f61954OooO0Oo = f3;
        this.f61956OooO0o0 = f4;
        this.f61955OooO0o = f5;
        this.f61957OooO0oO = f6;
        this.f61958OooO0oo = f7;
        this.f61950OooO = clipPathData;
        this.f61959OooOO0 = arrayList;
    }
}
