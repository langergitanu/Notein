package o0OOo0o;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.orion.notein.domain.models.folder.Folder;
import java.util.Iterator;
import java.util.List;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0o.o000OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteInFileUseCase", m80623f = "NoteInFileUseCase.kt", m80624l = {2018, 2024, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS}, m80625m = "restoreFolderLabels")
public final class C27414o000OooO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Folder f95685OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27387o0000o0 f95686OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public List f95687OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f95688OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Iterator f95689OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C27387o0000o0 f95690OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f95691OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f95692OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27414o000OooO(C27387o0000o0 c27387o0000o0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f95690OooOoo = c27387o0000o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f95691OooOoo0 = obj;
        this.f95692OooOooO |= Integer.MIN_VALUE;
        return this.f95690OooOoo.OoooOoo(null, null, this);
    }
}
