package o0o000OO;

import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import o0o000o0.C29775OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0oOo.InterfaceC33895OooO00o;

/* JADX INFO: renamed from: o0o000OO.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoViewModel$saveQuoteTextAnno$1", m80623f = "TextAnnoViewModel.kt", m80624l = {540, StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_2}, m80625m = "invokeSuspend")
public final class C29764OooOoO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public OooOO0O f105612OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC33895OooO00o f105613OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f105614OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C29775OooO00o f105615OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f105616OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C29775OooO00o f105617OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29764OooOoO0(OooOO0O oooOO0O, C29775OooO00o c29775OooO00o, Continuation<? super C29764OooOoO0> continuation) {
        super(2, continuation);
        this.f105616OooOoOO = oooOO0O;
        this.f105617OooOoo0 = c29775OooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29764OooOoO0(this.f105616OooOoOO, this.f105617OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29764OooOoO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        C29775OooO00o c29775OooO00o;
        OooOO0O oooOO0O;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105614OooOoO;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                OooOO0O oooOO0O2 = this.f105616OooOoOO;
                interfaceC33895OooO00o = oooOO0O2.f105530OooO;
                this.f105613OooOo0o = interfaceC33895OooO00o;
                this.f105612OooOo = oooOO0O2;
                c29775OooO00o = this.f105617OooOoo0;
                this.f105615OooOoO0 = c29775OooO00o;
                this.f105614OooOoO = 1;
                if (interfaceC33895OooO00o.OooO00o(this) != enumC32485OooO00o) {
                    oooOO0O = oooOO0O2;
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33895OooO00o2 = this.f105613OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return C32460OooOooO.f116667OooO00o;
                } catch (Throwable th) {
                    th = th;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    throw th;
                }
            }
            C29775OooO00o c29775OooO00o2 = this.f105615OooOoO0;
            oooOO0O = this.f105612OooOo;
            InterfaceC33895OooO00o interfaceC33895OooO00o3 = this.f105613OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c29775OooO00o = c29775OooO00o2;
            interfaceC33895OooO00o = interfaceC33895OooO00o3;
            this.f105613OooOo0o = interfaceC33895OooO00o;
            this.f105612OooOo = null;
            this.f105615OooOoO0 = null;
            this.f105614OooOoO = 2;
            if (OooOO0O.OooO0o(oooOO0O, c29775OooO00o, this) != enumC32485OooO00o) {
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                interfaceC33895OooO00o2.OooOOO0(null);
                return C32460OooOooO.f116667OooO00o;
            }
            return enumC32485OooO00o;
        } catch (Throwable th2) {
            th = th2;
            interfaceC33895OooO00o2 = interfaceC33895OooO00o;
            interfaceC33895OooO00o2.OooOOO0(null);
            throw th;
        }
    }
}
