package o0OO0oo0;

import android.graphics.Bitmap;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO0o0oOo.C33898OooO0Oo;

/* JADX INFO: renamed from: o0OO0oo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.handwriting.GoogleOCRDataSource", m80623f = "GoogleOCRDataSource.kt", m80624l = {256}, m80625m = "recognize")
public final class C26946OooO0O0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Bitmap f93593OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C26947OooO0OO f93594OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f93595OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C33898OooO0Oo f93596OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C26947OooO0OO f93597OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f93598OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26946OooO0O0(C26947OooO0OO c26947OooO0OO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f93597OooOoOO = c26947OooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f93595OooOoO = obj;
        this.f93598OooOoo0 |= Integer.MIN_VALUE;
        return this.f93597OooOoOO.OooO0O0(null, this);
    }
}
