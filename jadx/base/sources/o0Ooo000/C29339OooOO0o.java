package o0Ooo000;

import OooOoo.C20593OooO0Oo;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.NoteTreeInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Ooo000.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.dialog.NoteTreeSelectionFragment$bindList$1", m80623f = "NoteTreeSelectionFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29339OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends NoteTreeInfo>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C29328OooO f104062OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f104063OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f104064OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29339OooOO0o(C29328OooO c29328OooO, String str, Continuation<? super C29339OooOO0o> continuation) {
        super(2, continuation);
        this.f104062OooOo = c29328OooO;
        this.f104064OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C29339OooOO0o c29339OooOO0o = new C29339OooOO0o(this.f104062OooOo, this.f104064OooOoO0, continuation);
        c29339OooOO0o.f104063OooOo0o = obj;
        return c29339OooOO0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(List<? extends NoteTreeInfo> list, Continuation<? super C32460OooOooO> continuation) {
        return ((C29339OooOO0o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = (List) this.f104063OooOo0o;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(((NoteTreeInfo) obj2).getNoteId(), this.f104064OooOoO0)) {
                arrayList.add(obj2);
            }
        }
        String strOooO0O0 = C20593OooO0Oo.OooO0O0("all filtered notes: ", oOo000Oo.OooOo.o000oOoO(list, null, null, null, new C29338OooOO0O(0), 31), ".");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("NoteTreeSelection");
        c20358OooO00o.OooO00o(strOooO0O0, new Object[0]);
        this.f104062OooOo.OooO0Oo(arrayList);
        return C32460OooOooO.f116667OooO00o;
    }
}
