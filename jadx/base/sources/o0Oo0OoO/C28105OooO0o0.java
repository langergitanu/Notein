package o0Oo0OoO;

import java.io.File;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0Oo0OoO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.task.FolderBackupTask", m80623f = "FolderBackupTask.kt", m80624l = {166, 170}, m80625m = "getFolderList")
public final class C28105OooO0o0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f99596OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C28108OooOO0 f99597OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public File f99598OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public File f99599OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f99600OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f99601OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C28108OooOO0 f99602OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28105OooO0o0(C28108OooOO0 c28108OooOO0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f99602OooOoo0 = c28108OooOO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f99600OooOoOO = obj;
        this.f99601OooOoo |= Integer.MIN_VALUE;
        return this.f99602OooOoo0.o0000Ooo(null, null, null, this);
    }
}
