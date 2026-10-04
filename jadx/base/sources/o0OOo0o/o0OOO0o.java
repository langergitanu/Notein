package o0OOo0o;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.note.Note;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27309OooOoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.FolderUseCase$getNoteListInFolderRecursive$2", m80623f = "FolderUseCase.kt", m80624l = {StyleIdentifier.TOC_HEADING, StyleIdentifier.PLAIN_TABLE_3}, m80625m = "invokeSuspend")
public final class o0OOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Note>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f96947OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public LinkedHashMap f96948OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27600o0ooOO0 f96949OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(C27600o0ooOO0 c27600o0ooOO0, Continuation continuation) {
        super(2, continuation);
        this.f96949OooOoO0 = c27600o0ooOO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o0OOO0o(this.f96949OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Note>> continuation) {
        return ((o0OOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad A[LOOP:0: B:33:0x00a7->B:35:0x00ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LinkedHashMap linkedHashMap;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96947OooOo;
        C27600o0ooOO0 c27600o0ooOO0 = this.f96949OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f96947OooOo = 1;
            obj = c27600o0ooOO0.OooO0oo(null, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            linkedHashMap = this.f96948OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            List list = (List) obj;
            int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iOooO0Oo >= 16 ? iOooO0Oo : 16);
            for (Object obj2 : list) {
                linkedHashMap2.put(((NoteContent) obj2).getId(), obj2);
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                NoteMeta noteMeta = (NoteMeta) entry.getValue();
                NoteContent noteContent = (NoteContent) linkedHashMap2.get(str);
                Note noteOooO0O0 = noteContent == null ? null : o0oOO.OooO0O0(noteMeta, noteContent);
                if (noteOooO0O0 != null) {
                    arrayList.add(noteOooO0O0);
                }
            }
            return arrayList;
        }
        C32446OooOOOo.OooO0O0(obj);
        List list2 = (List) obj;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((NoteMeta) it.next()).getId());
        }
        int iOooO0Oo2 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list2, 10));
        if (iOooO0Oo2 < 16) {
            iOooO0Oo2 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iOooO0Oo2);
        for (Object obj3 : list2) {
            linkedHashMap3.put(((NoteMeta) obj3).getId(), obj3);
        }
        InterfaceC27309OooOoO interfaceC27309OooOoO = c27600o0ooOO0.f96985OooO0Oo;
        this.f96948OooOo0o = linkedHashMap3;
        this.f96947OooOo = 2;
        obj = interfaceC27309OooOoO.OooO0oo(arrayList2, this);
        if (obj != enumC32485OooO00o) {
            linkedHashMap = linkedHashMap3;
            List list3 = (List) obj;
            int iOooO0Oo3 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list3, 10));
            LinkedHashMap linkedHashMap22 = new LinkedHashMap(iOooO0Oo3 >= 16 ? iOooO0Oo3 : 16);
            while (r11.hasNext()) {
            }
            ArrayList arrayList3 = new ArrayList();
            while (r0.hasNext()) {
            }
            return arrayList3;
        }
        return enumC32485OooO00o;
    }
}
