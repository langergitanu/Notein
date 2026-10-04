package o0oOOooO;

import com.orion.notein.domain.models.sticker.StickerCollection;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27321Oooo0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0oOOooO.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.StickerViewModel$selectedStickerCollectionNameToEditable$1", m80623f = "StickerViewModel.kt", m80624l = {104}, m80625m = "invokeSuspend")
public final class C30891OooOOO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<String, List<? extends StickerCollection>, Continuation<? super C32443OooOOO<? extends String, ? extends Boolean>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ String f110393OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110394OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30898OooOo00 f110395OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30891OooOOO(Continuation continuation, C30898OooOo00 c30898OooOo00) {
        super(3, continuation);
        this.f110395OooOoO0 = c30898OooOo00;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(String str, List<? extends StickerCollection> list, Continuation<? super C32443OooOOO<? extends String, ? extends Boolean>> continuation) {
        C30891OooOOO c30891OooOOO = new C30891OooOOO(continuation, this.f110395OooOoO0);
        c30891OooOOO.f110393OooOo = str;
        return c30891OooOOO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110394OooOo0o;
        C30898OooOo00 c30898OooOo00 = this.f110395OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            str = this.f110393OooOo;
            if (str.length() != 0) {
                InterfaceC27321Oooo0o interfaceC27321Oooo0o = c30898OooOo00.f110433OooO0Oo;
                String strOooO0Oo = c30898OooOo00.f110435OooO0o0.OooO0Oo();
                this.f110393OooOo = str;
                this.f110394OooOo0o = 1;
                Object objOooO = interfaceC27321Oooo0o.OooO(str, strOooO0Oo, this);
                if (objOooO == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                str2 = str;
                obj = objOooO;
            }
            return new C32443OooOOO(strOooO0o, Boolean.valueOf(str.length() > 0));
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str2 = this.f110393OooOo;
        C32446OooOOOo.OooO0O0(obj);
        StickerCollection stickerCollection = (StickerCollection) obj;
        strOooO0o = stickerCollection != null ? c30898OooOo00.f110434OooO0o.OooO0o(stickerCollection) : null;
        str = str2;
        return new C32443OooOOO(strOooO0o, Boolean.valueOf(str.length() > 0));
    }
}
