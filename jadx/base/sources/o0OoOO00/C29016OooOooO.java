package o0OoOO00;

import android.content.Context;
import android.net.Uri;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PaperSpec;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000oooo.C24761OooO;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27570o00oOoo0;
import o0OOo0o.C27571o00oOooO;
import o0OoO0oo.C28691OooO0oO;
import oO00ooO.C32443OooOOO;
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
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OoOO00.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.AddPageViewModel$insertImagePage$2", m80623f = "AddPageViewModel.kt", m80624l = {394, 398, 400, 413}, m80625m = "invokeSuspend")
public final class C29016OooOooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Context f102783OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public NoteContent f102784OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Collection f102785OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public com.orion.notein.p607ui.noteeditor.addpage.OooO0OO f102786OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Iterator f102787OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.addpage.OooO0OO f102788OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f102789OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ List<Uri> f102790OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ Context f102791OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C29016OooOooO(com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OO, List<? extends Uri> list, Context context, Continuation<? super C29016OooOooO> continuation) {
        super(2, continuation);
        this.f102788OooOoo = oooO0OO;
        this.f102790OooOooO = list;
        this.f102791OooOooo = context;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29016OooOooO(this.f102788OooOoo, this.f102790OooOooO, this.f102791OooOooo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29016OooOooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if (r0 == r6) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00da, code lost:
    
        if (r3 == r6) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x017c, code lost:
    
        if (r7.f73852OooO0Oo.OooO0Oo(r0, r10, r3, true, r41) == r6) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b2 -> B:31:0x0127). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00da -> B:30:0x00de). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooOoO0;
        NoteContent noteContent;
        Collection arrayList;
        Iterator it;
        Context context;
        com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OO;
        Object objOooO0o;
        NoteContent noteContent2;
        com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OO2;
        Collection collection;
        Iterator it2;
        String str;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102789OooOoo0;
        int i2 = 3;
        com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OO3 = this.f102788OooOoo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27449o00O0OoO c27449o00O0OoO = oooO0OO3.f73852OooO0Oo;
            String str2 = (String) oooO0OO3.f73859OooOO0o.getValue();
            this.f102789OooOoo0 = 1;
            objOooOoO0 = c27449o00O0OoO.OooOoO0(str2, this);
        } else if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            objOooOoO0 = obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                it2 = this.f102787OooOoOO;
                collection = this.f102785OooOoO;
                oooO0OO2 = this.f102786OooOoO0;
                context = this.f102783OooOo;
                noteContent2 = this.f102784OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                Object objOooO0o2 = obj;
                C32443OooOOO c32443OooOOO = (C32443OooOOO) objOooO0o2;
                PaperTheme paperTheme = (PaperTheme) c32443OooOOO.f116638OooOo0o;
                Page page = new Page(C24761OooO.OooO00o("toString(...)"), noteContent2.getId(), (PaperSpec) c32443OooOOO.f116637OooOo, paperTheme.getOrientation(), paperTheme, null, null, "", false, 2, 0L, 0L, null, null, 0, false, null, null, null, 523616, null);
                Collection collection2 = collection;
                it = it2;
                noteContent = noteContent2;
                oooO0OO = oooO0OO2;
                arrayList = collection2;
                Page page2 = page;
                if (page2 != null) {
                    arrayList.add(page2);
                }
                i2 = 3;
                if (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    this.f102784OooOo0o = noteContent;
                    this.f102783OooOo = context;
                    this.f102786OooOoO0 = oooO0OO;
                    this.f102785OooOoO = arrayList;
                    this.f102787OooOoOO = it;
                    this.f102789OooOoo0 = 2;
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28691OooO0oO(context, uri, null), this);
                    if (objOooO0o != enumC32485OooO00o) {
                        com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OO4 = oooO0OO;
                        noteContent2 = noteContent;
                        it2 = it;
                        collection = arrayList;
                        oooO0OO2 = oooO0OO4;
                        str = (String) objOooO0o;
                        if (str != null) {
                            Collection collection3 = collection;
                            it = it2;
                            noteContent = noteContent2;
                            oooO0OO = oooO0OO2;
                            arrayList = collection3;
                            page2 = null;
                            if (page2 != null) {
                            }
                            i2 = 3;
                            if (it.hasNext()) {
                                List list = (List) arrayList;
                                List<Page> pages = noteContent.getPages();
                                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(pages, 10));
                                Iterator<T> it3 = pages.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(((Page) it3.next()).getId());
                                }
                                int iIndexOf = arrayList2.indexOf(oooO0OO3.f73861OooOOO0.getValue()) + 1;
                                this.f102784OooOo0o = null;
                                this.f102783OooOo = null;
                                this.f102786OooOoO0 = null;
                                this.f102785OooOoO = null;
                                this.f102787OooOoOO = null;
                                this.f102789OooOoo0 = 4;
                            }
                        } else {
                            C27570o00oOoo0 c27570o00oOoo0 = oooO0OO2.f73854OooO0o0;
                            this.f102784OooOo0o = noteContent2;
                            this.f102783OooOo = context;
                            this.f102786OooOoO0 = oooO0OO2;
                            this.f102785OooOoO = collection;
                            this.f102787OooOoOO = it2;
                            this.f102789OooOoo0 = i2;
                            c27570o00oOoo0.getClass();
                            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                            objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27571o00oOooO(str, c27570o00oOoo0, null, null), this);
                        }
                    }
                }
                return enumC32485OooO00o;
            }
            it2 = this.f102787OooOoOO;
            collection = this.f102785OooOoO;
            oooO0OO2 = this.f102786OooOoO0;
            context = this.f102783OooOo;
            noteContent2 = this.f102784OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooO0o = obj;
            str = (String) objOooO0o;
            if (str != null) {
            }
        }
        kotlin.jvm.internal.OooOOO0.OooO0Oo(objOooOoO0);
        noteContent = (NoteContent) objOooOoO0;
        List<Uri> list2 = this.f102790OooOooO;
        arrayList = new ArrayList();
        it = list2.iterator();
        context = this.f102791OooOooo;
        oooO0OO = oooO0OO3;
        if (it.hasNext()) {
        }
        return enumC32485OooO00o;
    }
}
