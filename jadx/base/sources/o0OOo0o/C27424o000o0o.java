package o0OOo0o;

import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import o0OoO0oo.C28725Oooo0oo;
import o0OoO0oo.C28729OoooO0O;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OOo0o.o000o0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27424o000o0o implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f95761OooOo0o;

    public /* synthetic */ C27424o000o0o(int i) {
        this.f95761OooOo0o = i;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f95761OooOo0o) {
            case 0:
                String string = ((StackTraceElement) obj).toString();
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                return string;
            default:
                Fragment it = (Fragment) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                C28729OoooO0O c28729OoooO0OOooOoOO = ((LockNoteFragment) it).OooOoOO();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new C28725Oooo0oo(c28729OoooO0OOooOoOO, null), 3);
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
