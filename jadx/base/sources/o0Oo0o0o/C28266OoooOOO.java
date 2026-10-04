package o0Oo0o0o;

import java.io.File;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0Oo0o0o.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ImageExporter", m80623f = "ImageExporter.kt", m80624l = {221}, m80625m = "exportPages")
public final class C28266OoooOOO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f100158OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public File f100159OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f100160OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C28261OoooO f100161OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28266OoooOOO(C28261OoooO c28261OoooO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f100161OooOoO0 = c28261OoooO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f100158OooOo = obj;
        this.f100160OooOoO |= Integer.MIN_VALUE;
        return this.f100161OooOoO0.OooO0Oo(null, null, null, null, 0, null, null, this);
    }
}
