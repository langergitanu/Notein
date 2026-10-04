package o0OOO0O;

import com.shockwave.pdfium.PdfiumCore;
import java.util.Iterator;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOO0O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.oss.ObjectStorageServiceRepoImpl", m80623f = "ObjectStorageServiceRepoImpl.kt", m80624l = {52}, m80625m = "clearInvalidTheme")
public final class C26998OooO0Oo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public PdfiumCore f93902OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C26999OooO0o0 f93903OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f93904OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f93905OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C26999OooO0o0 f93906OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f93907OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26998OooO0Oo(C26999OooO0o0 c26999OooO0o0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f93906OooOoOO = c26999OooO0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f93904OooOoO = obj;
        this.f93907OooOoo0 |= Integer.MIN_VALUE;
        return C26999OooO0o0.OooO0Oo(this.f93906OooOoOO, null, this);
    }
}
