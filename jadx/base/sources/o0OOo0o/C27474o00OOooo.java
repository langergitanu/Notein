package o0OOo0o;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.page.Image;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OO00o0.C26596o00O0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.o00OOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$setImageUnFixed$2", m80623f = "NoteUseCase.kt", m80624l = {StyleIdentifier.GRID_TABLE_4_ACCENT_6, StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6}, m80625m = "invokeSuspend")
public final class C27474o00OOooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f96252OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96253OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f96254OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f96255OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27474o00OOooo(String str, String str2, Continuation continuation, C27449o00O0OoO c27449o00O0OoO) {
        super(2, continuation);
        this.f96252OooOo = c27449o00O0OoO;
        this.f96255OooOoO0 = str;
        this.f96254OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27474o00OOooo(this.f96255OooOoO0, this.f96254OooOoO, continuation, this.f96252OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27474o00OOooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r4.OooOOoo(r3, r2, r20) == r1) goto L17;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO0oo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96253OooOo0o;
        String str = this.f96254OooOoO;
        C27449o00O0OoO c27449o00O0OoO = this.f96252OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C26596o00O0o0 c26596o00O0o0 = c27449o00O0OoO.f96047OooOOO0;
            this.f96253OooOo0o = 1;
            objOooO0oo = c26596o00O0o0.OooO0oo(this.f96255OooOoO0, str, this);
            if (objOooO0oo != enumC32485OooO00o) {
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
        objOooO0oo = obj;
        Image image = (Image) objOooO0oo;
        if (image == null) {
            return null;
        }
        Image imageCopy$default = Image.copy$default(image, null, null, null, null, null, 0.0f, 0L, 0L, false, 255, null);
        C26596o00O0o0 c26596o00O0o02 = c27449o00O0OoO.f96047OooOOO0;
        List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(imageCopy$default);
        this.f96253OooOo0o = 2;
    }
}
