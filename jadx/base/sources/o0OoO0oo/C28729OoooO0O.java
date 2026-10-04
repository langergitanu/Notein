package o0OoO0oo;

import androidx.lifecycle.AbstractC22019Ooooooo;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import o0OOo0Oo.InterfaceC27307OooOo0O;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27452o00O0Ooo;
import o0OOoo0.C27830OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OoO0oo.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lo0OoO0oo/OoooO0O;", "Landroidx/lifecycle/Ooooooo;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class C28729OoooO0O extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC27307OooOo0O f101773OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0OOo0oo.o0ooOOo f101774OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C27449o00O0OoO f101775OooO0o0;

    public C28729OoooO0O(InterfaceC27307OooOo0O lockNoteRepo, C27449o00O0OoO c27449o00O0OoO, o0OOo0oo.o0ooOOo o0ooooo2, C27830OooO00o c27830OooO00o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(lockNoteRepo, "lockNoteRepo");
        this.f101773OooO0Oo = lockNoteRepo;
        this.f101775OooO0o0 = c27449o00O0OoO;
        this.f101774OooO0o = o0ooooo2;
    }

    public final Object OooO0o(AbstractC32476OooO abstractC32476OooO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28724Oooo0oO(this, null), abstractC32476OooO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(List list, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C28723Oooo0o0 c28723Oooo0o0;
        if (abstractC32479OooO0OO instanceof C28723Oooo0o0) {
            c28723Oooo0o0 = (C28723Oooo0o0) abstractC32479OooO0OO;
            int i = c28723Oooo0o0.f101762OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28723Oooo0o0.f101762OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c28723Oooo0o0 = new C28723Oooo0o0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c28723Oooo0o0.f101761OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28723Oooo0o0.f101762OooOoO0;
        boolean z = true;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            c28723Oooo0o0.f101762OooOoO0 = 1;
            C27449o00O0OoO c27449o00O0OoO = this.f101775OooO0o0;
            c27449o00O0OoO.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27452o00O0Ooo(c27449o00O0OoO, list, null), c28723Oooo0o0);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        Iterable iterable = (Iterable) objOooO0o;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            z = false;
        } else {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((NoteMeta) it.next()).getLockAdded()) {
                    break;
                }
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
