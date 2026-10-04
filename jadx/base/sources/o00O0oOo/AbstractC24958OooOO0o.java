package o00O0oOo;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o00OO00o.C24988OooO00o;
import o00o0O0.C25316OooOO0o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o00O0oOo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24958OooOO0o implements InterfaceC24957OooOO0O {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Object f84649OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f84650OooOo0o = 1;

    public AbstractC24958OooOO0o() {
        char[] cArr = C25316OooOO0o.f86159OooO00o;
        this.f84649OooOo = new ArrayDeque(20);
    }

    public void OooO00o(o00OooOO.OooO oooO) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f84649OooOo;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(oooO);
        }
    }

    @Override // o00O0oOo.InterfaceC24957OooOO0O
    public boolean OooO0o0() {
        List list = (List) this.f84649OooOo;
        return list.isEmpty() || (list.size() == 1 && ((C24988OooO00o) list.get(0)).OooO00o());
    }

    @Override // o00O0oOo.InterfaceC24957OooOO0O
    public List OooO0oo() {
        return (List) this.f84649OooOo;
    }

    public String toString() {
        switch (this.f84650OooOo0o) {
            case 0:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.f84649OooOo;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public AbstractC24958OooOO0o(List list) {
        this.f84649OooOo = list;
    }

    public AbstractC24958OooOO0o(InterfaceC32507OooOO0o info) {
        OooOOO0.OooO0oO(info, "info");
        this.f84649OooOo = info;
    }
}
