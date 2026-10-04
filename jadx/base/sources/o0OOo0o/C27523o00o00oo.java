package o0OOo0o;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.sticker.StickerCollection;
import java.io.File;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27321Oooo0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.o00o00oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.StickerUseCase$deleteStickerCollection$2", m80623f = "StickerUseCase.kt", m80624l = {StyleIdentifier.LIST_TABLE_5_DARK, StyleIdentifier.LIST_TABLE_3_ACCENT_1, StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_1}, m80625m = "invokeSuspend")
public final class C27523o00o00oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27538o00o0o0O f96474OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96475OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f96476OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27523o00o00oo(C27538o00o0o0O c27538o00o0o0O, String str, Continuation<? super C27523o00o00oo> continuation) {
        super(2, continuation);
        this.f96474OooOo = c27538o00o0o0O;
        this.f96476OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27523o00o00oo(this.f96474OooOo, this.f96476OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Object> continuation) {
        return ((C27523o00o00oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r8 != r0) goto L25;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96475OooOo0o;
        String str = this.f96476OooOoO0;
        C27538o00o0o0O c27538o00o0o0O = this.f96474OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC27321Oooo0o interfaceC27321Oooo0o = c27538o00o0o0O.f96550OooO00o;
            String strOooO0Oo = c27538o00o0o0O.f96551OooO0O0.OooO0Oo();
            this.f96475OooOo0o = 1;
            obj = interfaceC27321Oooo0o.OooO(str, strOooO0Oo, this);
            if (obj != enumC32485OooO00o) {
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
                return Boolean.valueOf(C32501OooO0oO.OooO0Oo((File) obj));
            }
            C32446OooOOOo.OooO0O0(obj);
            this.f96475OooOo0o = 3;
            obj = C27538o00o0o0O.OooO0Oo(c27538o00o0o0O, str, this);
        }
        if (((StickerCollection) obj) == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("StickerUseCase");
            c20358OooO00o.OooOO0O("deleteStickerCollection failed, can not find sticker to delete.", new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        InterfaceC27321Oooo0o interfaceC27321Oooo0o2 = c27538o00o0o0O.f96550OooO00o;
        this.f96475OooOo0o = 2;
        if (interfaceC27321Oooo0o2.OooOO0(str, this) != enumC32485OooO00o) {
            this.f96475OooOo0o = 3;
            obj = C27538o00o0o0O.OooO0Oo(c27538o00o0o0O, str, this);
        }
        return enumC32485OooO00o;
    }
}
