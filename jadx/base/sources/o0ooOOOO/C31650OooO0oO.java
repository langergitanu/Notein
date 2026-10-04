package o0ooOOOO;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.File;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0ooOOOO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.pdfcore.PDFCreator", m80623f = "PDFCreator.kt", m80624l = {124}, m80625m = "optimizePdfDocument")
public final class C31650OooO0oO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Uri f113146OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public File f113147OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f113148OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ContentResolver f113149OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f113150OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f113151OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C31644OooO0O0 f113152OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31650OooO0oO(C31644OooO0O0 c31644OooO0O0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f113152OooOoo0 = c31644OooO0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f113150OooOoOO = obj;
        this.f113151OooOoo |= Integer.MIN_VALUE;
        return this.f113152OooOoo0.OooOOo0(null, null, null, this);
    }
}
