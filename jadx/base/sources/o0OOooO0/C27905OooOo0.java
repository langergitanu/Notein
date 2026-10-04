package o0OOooO0;

import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.p609vo.NoteVOFilter;
import o0OOooO0.AbstractC27907OooOo0O;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0OOooO0.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27905OooOo0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f98675OooOo0o;

    public /* synthetic */ C27905OooOo0(int i) {
        this.f98675OooOo0o = i;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f98675OooOo0o) {
            case 0:
                AbstractC27907OooOo0O.OooOOO.OooO0O0 d = (AbstractC27907OooOo0O.OooOOO.OooO0O0) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(d, "d");
                return d.f98737OooO00o.f98718OooO00o;
            default:
                return Boolean.valueOf(NoteVOFilter.getFilterFunction$lambda$1((NoteVO) obj));
        }
    }
}
