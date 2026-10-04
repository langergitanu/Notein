package o0o00oOo;

import android.net.Uri;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0oo.o0000OOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o00oOo.Ooooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$importSelectedPdfFiles$2", m80623f = "NoteListViewModel.kt", m80624l = {1832, 1833}, m80625m = "invokeSuspend")
public final class C30072Ooooo00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.notelist.OooO0OO f106980OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f106981OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f106982OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<Uri> f106983OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C30072Ooooo00(com.orion.notein.p607ui.notelist.OooO0OO oooO0OO, List<? extends Uri> list, String str, Continuation<? super C30072Ooooo00> continuation) {
        super(2, continuation);
        this.f106980OooOo = oooO0OO;
        this.f106983OooOoO0 = list;
        this.f106982OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30072Ooooo00(this.f106980OooOo, this.f106983OooOoO0, this.f106982OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30072Ooooo00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r6.OooO00o(r5) == r0) goto L15;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f106981OooOo0o;
        com.orion.notein.p607ui.notelist.OooO0OO oooO0OO = this.f106980OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f106981OooOo0o = 1;
            if (com.orion.notein.p607ui.notelist.OooO0OO.OooO0o(oooO0OO, this.f106983OooOoO0, this.f106982OooOoO, this) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        o0000OOO o0000ooo = oooO0OO.f77133OooOOo;
        this.f106981OooOo0o = 2;
    }
}
