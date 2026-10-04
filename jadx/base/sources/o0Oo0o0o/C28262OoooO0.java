package o0Oo0o0o;

import com.aspose.words.StyleIdentifier;
import java.io.File;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0oOo.C33898OooO0Oo;

/* JADX INFO: renamed from: o0Oo0o0o.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportViewModel$parseExportedIdList$1", m80623f = "ExportViewModel.kt", m80624l = {StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_5}, m80625m = "invokeSuspend")
public final class C28262OoooO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public com.orion.notein.p607ui.export.OooO0o f100132OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C33898OooO0Oo f100133OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f100134OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f100135OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.export.OooO0o f100136OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f100137OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28262OoooO0(com.orion.notein.p607ui.export.OooO0o oooO0o, String str, Continuation<? super C28262OoooO0> continuation) {
        super(2, continuation);
        this.f100136OooOoOO = oooO0o;
        this.f100137OooOoo0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28262OoooO0(this.f100136OooOoOO, this.f100137OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28262OoooO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        com.orion.notein.p607ui.export.OooO0o oooO0o;
        C33898OooO0Oo c33898OooO0Oo;
        String str;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100134OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            oooO0o = this.f100136OooOoOO;
            C33898OooO0Oo c33898OooO0Oo2 = oooO0o.f71771OooOo0o;
            this.f100133OooOo0o = c33898OooO0Oo2;
            this.f100132OooOo = oooO0o;
            String str2 = this.f100137OooOoo0;
            this.f100135OooOoO0 = str2;
            this.f100134OooOoO = 1;
            if (c33898OooO0Oo2.OooO00o(this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c33898OooO0Oo = c33898OooO0Oo2;
            str = str2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = this.f100135OooOoO0;
            oooO0o = this.f100132OooOo;
            c33898OooO0Oo = this.f100133OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        try {
            if (!oooO0o.f71767OooOo.isEmpty()) {
                return C32460OooOooO.f116667OooO00o;
            }
            try {
                File file = new File(str);
                oooO0o.f71767OooOo.addAll(C32501OooO0oO.OooO0oO(file));
                file.delete();
            } catch (Exception unused) {
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            c33898OooO0Oo.OooOOO0(null);
            return C32460OooOooO.f116667OooO00o;
        } finally {
            c33898OooO0Oo.OooOOO0(null);
        }
    }
}
