package o000oo0;

import android.view.ViewConfiguration;
import o0Ooo000.C29363Oooo0O0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o000oo0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24659OooO0o implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f83538OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f83539OooOo0o;

    public /* synthetic */ C24659OooO0o(Object obj, int i) {
        this.f83539OooOo0o = i;
        this.f83538OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f83539OooOo0o) {
            case 0:
                ((androidx.room.OooO0OO) this.f83538OooOo).getClass();
                return C32460OooOooO.f116667OooO00o;
            default:
                return Float.valueOf(((ViewConfiguration) ((C29363Oooo0O0) this.f83538OooOo).f104125OooO0O0.getValue()).getScaledTouchSlop());
        }
    }
}
