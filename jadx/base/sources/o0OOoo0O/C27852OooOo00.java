package o0OOoo0O;

import o0OO0ooO.C26962OooOO0O;
import o0OOo0Oo.InterfaceC27304OooOo;
import o0OOo0Oo.InterfaceC27310OooOoO0;
import oO0o0Oo.C33770OooooO0;

/* JADX INFO: renamed from: o0OOoo0O.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27852OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27310OooOoO0 f98418OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC27304OooOo f98419OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C26962OooOO0O f98420OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27854OooOo0o f98421OooO0Oo;

    public C27852OooOo00(InterfaceC27310OooOoO0 materialRepository, InterfaceC27304OooOo downloadRepository, C26962OooOO0O materialDownloader, C27854OooOo0o c27854OooOo0o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(materialRepository, "materialRepository");
        kotlin.jvm.internal.OooOOO0.OooO0oO(downloadRepository, "downloadRepository");
        kotlin.jvm.internal.OooOOO0.OooO0oO(materialDownloader, "materialDownloader");
        this.f98418OooO00o = materialRepository;
        this.f98419OooO0O0 = downloadRepository;
        this.f98420OooO0OO = materialDownloader;
        this.f98421OooO0Oo = c27854OooOo0o;
    }

    public final C33770OooooO0 OooO00o(String materialId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(materialId, "materialId");
        return new C33770OooooO0(new C27847OooOOo(this, materialId, null));
    }
}
