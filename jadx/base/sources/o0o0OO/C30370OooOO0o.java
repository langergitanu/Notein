package o0o0OO;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27441o000oooo;
import o0OOo0o.C27449o00O0OoO;
import o0o0OO.C30367OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o0OO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.viewmodel.TiledPageViewModel$createNoteByPages$1", m80623f = "TiledPageViewModel.kt", m80624l = {382, 385, 386, 389}, m80625m = "invokeSuspend")
public final class C30370OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ArrayList f108378OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108379OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f108380OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30367OooO0o0 f108381OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f108382OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30370OooOO0o(ArrayList arrayList, C30367OooO0o0 c30367OooO0o0, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f108378OooOo = arrayList;
        this.f108381OooOoO0 = c30367OooO0o0;
        this.f108380OooOoO = str;
        this.f108382OooOoOO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30370OooOO0o(this.f108378OooOo, this.f108381OooOoO0, this.f108380OooOoO, this.f108382OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30370OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        if (r12.emit(r0, r14) != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        if (r12.emit(r15, r14) != r1) goto L31;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108379OooOo0o;
        C30367OooO0o0 c30367OooO0o0 = this.f108381OooOoO0;
        ArrayList arrayList = this.f108378OooOo;
        C33772OooooOo c33772OooooOo = c30367OooO0o0.f108335OooOO0o;
        try {
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("TiledPageViewModel");
            c20358OooO00o.OooO0Oo(e, "Unable to create note by pages", new Object[0]);
            C30367OooO0o0.OooO00o oooO00o = new C30367OooO0o0.OooO00o(2, "", arrayList, false);
            this.f108379OooOo0o = 4;
        }
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (arrayList.size() > 20) {
                C33772OooooOo c33772OooooOo2 = c30367OooO0o0.f108333OooOO0;
                Integer num = new Integer(2);
                this.f108379OooOo0o = 1;
                if (c33772OooooOo2.emit(num, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
        } else if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            C30367OooO0o0.OooO00o oooO00o2 = new C30367OooO0o0.OooO00o(2, (String) obj, arrayList, true);
            this.f108379OooOo0o = 3;
        }
        C27449o00O0OoO c27449o00O0OoO = c30367OooO0o0.f108328OooO0Oo;
        String str = this.f108380OooOoO;
        String str2 = this.f108382OooOoOO;
        this.f108379OooOo0o = 2;
        c27449o00O0OoO.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27441o000oooo(str, str2, arrayList, null, c27449o00O0OoO), this);
        if (obj != enumC32485OooO00o) {
            C30367OooO0o0.OooO00o oooO00o22 = new C30367OooO0o0.OooO00o(2, (String) obj, arrayList, true);
            this.f108379OooOo0o = 3;
        }
        return enumC32485OooO00o;
    }
}
