package o0OOO0O0;

import android.net.Uri;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ocr.datasource.AiOcrSessionLocalDataSource", m80623f = "AiOcrSessionLocalDataSource.kt", m80624l = {100, 108}, m80625m = "saveSessionImage")
public final class OooO0o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Uri f93938OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f93939OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27002OooO0oO f93940OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f93941OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f93942OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(C27002OooO0oO c27002OooO0oO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f93940OooOoO = c27002OooO0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f93941OooOoO0 = obj;
        this.f93942OooOoOO |= Integer.MIN_VALUE;
        return this.f93940OooOoO.OooO0o(null, null, this);
    }
}
