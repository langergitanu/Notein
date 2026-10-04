package o0oo0ooo;

import Oooo00o.OooO0OO;
import java.util.List;

/* JADX INFO: renamed from: o0oo0ooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31412OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f112165OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f112166OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f112167OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f112168OooO0Oo;

    public C31412OooO00o(float f, float f2, float f3, float f4) {
        this.f112165OooO00o = f;
        this.f112166OooO0O0 = f2;
        this.f112167OooO0OO = f3;
        this.f112168OooO0Oo = f4;
    }

    public final float OooO00o() {
        return this.f112168OooO0Oo - this.f112166OooO0O0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f112165OooO00o);
        sb.append(",");
        sb.append(this.f112166OooO0O0);
        sb.append(",");
        sb.append(this.f112167OooO0OO);
        sb.append(",");
        return OooO0OO.OooO0OO(sb, this.f112168OooO0Oo, "]");
    }

    public C31412OooO00o(List<Number> list) {
        this.f112165OooO00o = list.get(0).floatValue();
        this.f112166OooO0O0 = list.get(1).floatValue();
        this.f112167OooO0OO = list.get(2).floatValue();
        this.f112168OooO0Oo = list.get(3).floatValue();
    }
}
