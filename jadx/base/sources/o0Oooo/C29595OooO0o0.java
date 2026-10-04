package o0Oooo;

import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.p605ai.NoteinAiQuotaRecordV2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24018OooO0oo;
import o000oooo.C24761OooO;
import o0OOOo0.C27174OooO0O0;
import o0OoooO.C29629OooOOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oooo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorAiViewModel$notifyChatAiQuotaCost$2", m80623f = "EditorAiViewModel.kt", m80624l = {510, 533}, m80625m = "invokeSuspend")
public final class C29595OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f104942OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public NoteMeta f104943OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f104944OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o f104945OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29595OooO0o0(com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o oooO00o, String str, Continuation<? super C29595OooO0o0> continuation) {
        super(2, continuation);
        this.f104945OooOoO0 = oooO00o;
        this.f104944OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29595OooO0o0(this.f104945OooOoO0, this.f104944OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C29595OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r10 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00de, code lost:
    
        if (r2 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e0, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NoteMeta noteMeta;
        Integer num;
        Object objOooO0oO;
        NoteinAiQuotaRecordV2.UsageMetadata usageMetadata;
        Object objOooO0O0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104942OooOo;
        com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o oooO00o = this.f104945OooOoO0;
        String str = this.f104944OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            noteMeta = (NoteMeta) oooO00o.f75604OooOOo.f121747OooOo0o.getValue();
            if (noteMeta == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("EditorChatViewModel");
                c20358OooO00o.OooO0OO("notifyAiQuotaCost: noteMeta is null", new Object[0]);
                return Boolean.FALSE;
            }
            C29629OooOOo0 c29629OooOOo0 = oooO00o.f75600OooOOO;
            if (c29629OooOOo0 != null) {
                this.f104943OooOo0o = noteMeta;
                this.f104942OooOo = 1;
                objOooO0oO = c29629OooOOo0.OooO0oO(str, this);
            } else {
                num = null;
                if (num != null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("EditorChatViewModel");
                    c20358OooO00o2.OooO0OO("notifyAiQuotaCost: tokensCount is null", new Object[0]);
                    usageMetadata = new NoteinAiQuotaRecordV2.UsageMetadata(0, 0L, 0, 0L, 1, C33599OooOo0O.Oooooo0(str).toString().length(), 15, (C24018OooO0oo) null);
                } else {
                    usageMetadata = new NoteinAiQuotaRecordV2.UsageMetadata(0, 0L, 0, 0L, 1, num.intValue(), 15, (C24018OooO0oo) null);
                }
                NoteinAiQuotaRecordV2 noteinAiQuotaRecordV2 = new NoteinAiQuotaRecordV2(C24761OooO.OooO00o("toString(...)"), noteMeta.getUserId(), usageMetadata.getAiChatBillableChars() * (-1), "source_type_expense", (String) null, usageMetadata, System.currentTimeMillis(), 16, (C24018OooO0oo) null);
                this.f104943OooOo0o = null;
                this.f104942OooOo = 2;
                oooO00o.f75598OooOO0O.set(true);
                objOooO0O0 = oooO00o.f75594OooO0o0.OooO0O0(noteinAiQuotaRecordV2, this);
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                objOooO0O0 = obj;
                C27174OooO0O0 c27174OooO0O0 = (C27174OooO0O0) objOooO0O0;
                return Boolean.valueOf(kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0") && kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.OooO0O0(), Boolean.TRUE));
            }
            noteMeta = this.f104943OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooO0oO = obj;
        }
        num = (Integer) objOooO0oO;
        if (num != null) {
        }
        NoteinAiQuotaRecordV2 noteinAiQuotaRecordV22 = new NoteinAiQuotaRecordV2(C24761OooO.OooO00o("toString(...)"), noteMeta.getUserId(), usageMetadata.getAiChatBillableChars() * (-1), "source_type_expense", (String) null, usageMetadata, System.currentTimeMillis(), 16, (C24018OooO0oo) null);
        this.f104943OooOo0o = null;
        this.f104942OooOo = 2;
        oooO00o.f75598OooOO0O.set(true);
        objOooO0O0 = oooO00o.f75594OooO0o0.OooO0O0(noteinAiQuotaRecordV22, this);
    }
}
