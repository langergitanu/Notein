package o0OOo0o;

import com.aspose.slides.exceptions.NotImplementedException;
import com.orion.notein.domain.models.page.Image;
import kotlin.coroutines.Continuation;
import o0OO00o0.C26515OooooO0;
import o0OO00o0.C26596o00O0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$deleteDualLinkRefWithItem$2", m80623f = "NoteUseCase.kt", m80624l = {769, 773, 775}, m80625m = "invokeSuspend")
public final class o0O0ooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f96934OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96935OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f96936OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f96937OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ int f96938OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f96939OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0ooO(C27449o00O0OoO c27449o00O0OoO, String str, String str2, int i, String str3, Continuation<? super o0O0ooO> continuation) {
        super(2, continuation);
        this.f96934OooOo = c27449o00O0OoO;
        this.f96937OooOoO0 = str;
        this.f96936OooOoO = str2;
        this.f96938OooOoOO = i;
        this.f96939OooOoo0 = str3;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o0O0ooO(this.f96934OooOo, this.f96937OooOoO0, this.f96936OooOoO, this.f96938OooOoOO, this.f96939OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o0O0ooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r6.OooOO0o(r8, r5, r7) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c A[RETURN] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Image image;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96935OooOo0o;
        String str = this.f96936OooOoO;
        C27449o00O0OoO c27449o00O0OoO = this.f96934OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C26515OooooO0 c26515OooooO0 = c27449o00O0OoO.f96052OooOOoo;
            this.f96935OooOo0o = 1;
            if (c26515OooooO0.OooO0OO(this.f96937OooOoO0, str, this) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            image = (Image) obj;
            if (image != null) {
                return null;
            }
            this.f96935OooOo0o = 3;
        }
        int i2 = this.f96938OooOoOO;
        if (i2 == 4) {
            throw new NotImplementedException();
        }
        if (i2 != 5) {
            throw new IllegalArgumentException("itemType is invalid");
        }
        C26596o00O0o0 c26596o00O0o0 = c27449o00O0OoO.f96047OooOOO0;
        this.f96935OooOo0o = 2;
        obj = c26596o00O0o0.OooO0oo(this.f96939OooOoo0, str, this);
        if (obj != enumC32485OooO00o) {
            image = (Image) obj;
            if (image != null) {
            }
        }
        return enumC32485OooO00o;
    }
}
