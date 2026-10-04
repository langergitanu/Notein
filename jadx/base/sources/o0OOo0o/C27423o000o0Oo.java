package o0OOo0o;

import com.orion.notein.domain.models.folder.Folder;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0Oo00o.C28028OooO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33763OoooOOO;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34436OooOoOO;

/* JADX INFO: renamed from: o0OOo0o.o000o0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteInFileUseCase$writeFolderTreeLabelJsonToDir$2", m80623f = "NoteInFileUseCase.kt", m80624l = {2039}, m80625m = "invokeSuspend")
public final class C27423o000o0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ List<Folder> f95757OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f95758OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ File f95759OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27387o0000o0 f95760OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27423o000o0Oo(List<Folder> list, C27387o0000o0 c27387o0000o0, File file, Continuation<? super C27423o000o0Oo> continuation) {
        super(2, continuation);
        this.f95757OooOo = list;
        this.f95760OooOoO0 = c27387o0000o0;
        this.f95759OooOoO = file;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27423o000o0Oo(this.f95757OooOo, this.f95760OooOoO0, this.f95759OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27423o000o0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95758OooOo0o;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                List<Folder> list = this.f95757OooOo;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Folder) it.next()).getId());
                }
                C33763OoooOOO c33763OoooOOOOooOOOO = this.f95760OooOoO0.f95448OooOo0o.f98267OooO00o.OooOOOO(arrayList);
                this.f95758OooOo0o = 1;
                obj = C25252OooO0Oo.OooOo00(c33763OoooOOOOooOOOO, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            Object obj2 = (Map) obj;
            if (obj2 == null) {
                obj2 = C34436OooOoOO.f123455OooOo0o;
            }
            String json = C28028OooO0o.OooO00o().toJson(obj2);
            kotlin.jvm.internal.OooOOO0.OooO0o(json, "toJson(...)");
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO00o("writeFolderTreeLabelJsonToDir, json: " + json, new Object[0]);
            File file = new File(this.f95759OooOoO.getAbsolutePath(), "folder_tree_labels.json");
            C32501OooO0oO.OooO(file, json);
            c20358OooO00o.OooO00o("writeFolderTreeLabelJsonToDir, file exist: " + file.exists(), new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("NoteInFileUseCase");
            c20358OooO00o2.OooO0Oo(e, "getFolderTreeLabelJsonFile failed.", new Object[0]);
            return null;
        }
    }
}
