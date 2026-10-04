package o0O0oooo;

import com.huawei.hms.network.embedded.C18115b5;
import com.orion.penkit.models.DrawRecord;
import oO00ooO.C32443OooOOO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0O0oooo.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26379OooOo0o implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f90501OooOo0o;

    public /* synthetic */ C26379OooOo0o(int i) {
        this.f90501OooOo0o = i;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f90501OooOo0o) {
            case 0:
                DrawRecord it = (DrawRecord) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                return true;
            default:
                C32443OooOOO c32443OooOOO = (C32443OooOOO) obj;
                return c32443OooOOO.f116638OooOo0o + C18115b5.CONNECTOR + c32443OooOOO.f116637OooOo;
        }
    }
}
