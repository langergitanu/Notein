package o0OOo0o;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.note.ColorSet;
import kotlin.coroutines.Continuation;
import o00OO0oO.C25003OooO0O0;
import o0OO0o0O.C26923OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OOo0o.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.ColorSetUseCase$updateColorSetName$2", m80623f = "ColorSetUseCase.kt", m80624l = {29, 30}, m80625m = "invokeSuspend")
public final class C27365OoooOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27366OoooOoo f95281OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f95282OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f95283OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f95284OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27365OoooOoO(C27366OoooOoo c27366OoooOoo, String str, String str2, Continuation<? super C27365OoooOoO> continuation) {
        super(2, continuation);
        this.f95281OooOo = c27366OoooOoo;
        this.f95284OooOoO0 = str;
        this.f95283OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27365OoooOoO(this.f95281OooOo, this.f95284OooOoO0, this.f95283OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27365OoooOoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (r2 == r1) goto L23;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooO0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95282OooOo0o;
        C27366OoooOoo c27366OoooOoo = this.f95281OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o0OO0o0O.OooO oooO = c27366OoooOoo.f95285OooO00o;
            this.f95282OooOo0o = 1;
            String str = this.f95284OooOoO0;
            C25003OooO0O0 c25003OooO0O0 = oooO.f93457OooO00o;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0OO0o0O.OooO0OO(c25003OooO0O0, str, null), this);
            if (objOooO0o != enumC32485OooO00o) {
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
        objOooO0o = obj;
        ColorSet colorSet = (ColorSet) objOooO0o;
        if (colorSet == null) {
            return null;
        }
        o0OO0o0O.OooO oooO2 = c27366OoooOoo.f95285OooO00o;
        ColorSet colorSetCopy$default = ColorSet.copy$default(colorSet, null, this.f95283OooOoO, null, 0, 0, 0, 0L, 0, StyleIdentifier.MEDIUM_GRID_1_ACCENT_6, null);
        this.f95282OooOo0o = 2;
        C25003OooO0O0 c25003OooO0O02 = oooO2.f93457OooO00o;
        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26923OooO0o0(c25003OooO0O02, colorSetCopy$default, null), this);
        if (objOooO0o2 != enumC32485OooO00o) {
            objOooO0o2 = C32460OooOooO.f116667OooO00o;
        }
        if (objOooO0o2 != enumC32485OooO00o) {
            objOooO0o2 = C32460OooOooO.f116667OooO00o;
        }
    }
}
