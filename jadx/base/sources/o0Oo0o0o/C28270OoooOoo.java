package o0Oo0o0o;

import java.io.File;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0Oo0o0o.OoooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.NativeFormatExporter", m80623f = "NativeFormatExporter.kt", m80624l = {50}, m80625m = "exportNotes")
public final class C28270OoooOoo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f100193OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public File f100194OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f100195OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C28274OooooOO f100196OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28270OoooOoo(C28274OooooOO c28274OooooOO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f100196OooOoO0 = c28274OooooOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f100193OooOo = obj;
        this.f100195OooOoO |= Integer.MIN_VALUE;
        return this.f100196OooOoO0.OooO0O0(null, null, null, 0, null, this);
    }
}
