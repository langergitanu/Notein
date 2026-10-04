package o0OOo0oo;

import com.aspose.words.StyleIdentifier;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.FolderBundleProcessor", m80623f = "CloudBundleProcessor.kt", m80624l = {StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_3, StyleIdentifier.LIST_TABLE_3_ACCENT_5}, m80625m = "pack-0E7RQCE")
public final class C27649Oooo0o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f97241OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f97242OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27647Oooo0O0 f97243OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f97244OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f97245OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27649Oooo0o(C27647Oooo0O0 c27647Oooo0O0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97243OooOoO = c27647Oooo0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97244OooOoO0 = obj;
        this.f97245OooOoOO |= Integer.MIN_VALUE;
        Object objOooO0o0 = this.f97243OooOoO.OooO0o0(null, false, this);
        return objOooO0o0 == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o0 : new C32445OooOOOO(objOooO0o0);
    }
}
