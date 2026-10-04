package o0Oo0O;

import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o00o00O0.C25252OooO0Oo;
import o0OOOoo.C27205OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0O.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.integrity.IntegrityViewModel$allowToShowRemediationDialog$2", m80623f = "IntegrityViewModel.kt", m80624l = {StyleIdentifier.GRID_TABLE_2}, m80625m = "invokeSuspend")
public final class C28045OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f99405OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f99406OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooOOO f99407OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28045OooO0oO(OooOOO oooOOO, Continuation<? super C28045OooO0oO> continuation) {
        super(2, continuation);
        this.f99407OooOoO0 = oooOOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28045OooO0oO(this.f99407OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C28045OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        long j;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99405OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            OooOOO oooOOO = this.f99407OooOoO0;
            long valueAsLong = oooOOO.f99427OooO0Oo.getValueAsLong("rconfig_remediation_dialog_interval_ms");
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("IntegrityViewModel");
            c20358OooO00o.OooO0o0("remediationDialogInterval: " + valueAsLong, new Object[0]);
            if (valueAsLong <= 0) {
                return Boolean.FALSE;
            }
            InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = oooOOO.f99429OooO0o0.getData();
            this.f99406OooOo0o = valueAsLong;
            this.f99405OooOo = 1;
            obj = C25252OooO0Oo.OooOOo(data, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            j = valueAsLong;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.f99406OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        Long l = (Long) ((AbstractC24338OooO0o0) obj).OooO0OO(C27205OooO0OO.f95021OooOo00);
        boolean z = System.currentTimeMillis() - (l != null ? l.longValue() : 0L) > j;
        Boolean boolValueOf = Boolean.valueOf(z);
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("IntegrityViewModel");
        c20358OooO00o2.OooO0o0("allowToShowRemediationDialog: " + z, new Object[0]);
        return boolValueOf;
    }
}
