package o0OOo0o;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NotePlaceHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27314OooOooO;
import o0OOoooO.C28009OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34431OooOo0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.FolderUseCase$getNotePlaceholderInFolderRecursive$2", m80623f = "FolderUseCase.kt", m80624l = {StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_1, StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_1, StyleIdentifier.GRID_TABLE_2_ACCENT_2}, m80625m = "invokeSuspend")
public final class oo0o0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends NotePlaceHolder>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Collection f97037OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f97038OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Collection f97039OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f97040OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f97041OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ Folder f97042OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C27600o0ooOO0 f97043OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(C27600o0ooOO0 c27600o0ooOO0, Folder folder, Continuation<? super oo0o0Oo> continuation) {
        super(2, continuation);
        this.f97043OooOoo0 = c27600o0ooOO0;
        this.f97042OooOoo = folder;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new oo0o0Oo(this.f97043OooOoo0, this.f97042OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends NotePlaceHolder>> continuation) {
        return ((oo0o0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (r10 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a7, code lost:
    
        if (r10 == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a7 -> B:32:0x00aa). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        List list2;
        Collection arrayList;
        Iterator it;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f97041OooOoOO;
        Folder folder = this.f97042OooOoo;
        C27600o0ooOO0 c27600o0ooOO0 = this.f97043OooOoo0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC27314OooOooO interfaceC27314OooOooO = c27600o0ooOO0.f96986OooO0o;
            String id = folder != null ? folder.getId() : null;
            this.f97041OooOoOO = 1;
            obj = interfaceC27314OooOooO.OooO0o0(id);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else if (i == 2) {
            list = (List) this.f97038OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            list2 = list;
            arrayList = new ArrayList();
            it = ((List) obj).iterator();
            if (it.hasNext()) {
            }
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = this.f97039OooOoO;
            it = this.f97040OooOoO0;
            arrayList = this.f97037OooOo;
            C27600o0ooOO0 c27600o0ooOO02 = (C27600o0ooOO0) this.f97038OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c27600o0ooOO0 = c27600o0ooOO02;
            C34431OooOo0.OooOo0o(arrayList, (Iterable) obj);
            if (it.hasNext()) {
                return oOo000Oo.OooOo.OooooOO(list2, (List) arrayList);
            }
            Folder folder2 = (Folder) it.next();
            this.f97038OooOo0o = c27600o0ooOO0;
            this.f97037OooOo = arrayList;
            this.f97040OooOoO0 = it;
            this.f97039OooOoO = list2;
            this.f97041OooOoOO = 3;
            c27600o0ooOO0.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new oo0o0Oo(c27600o0ooOO0, folder2, null), this);
        }
        list = (List) obj;
        C28009OooOOOO c28009OooOOOO = c27600o0ooOO0.f96982OooO00o;
        String id2 = folder != null ? folder.getId() : null;
        this.f97038OooOo0o = list;
        this.f97041OooOoOO = 2;
        obj = c28009OooOOOO.OooO0oO(id2, this);
    }
}
