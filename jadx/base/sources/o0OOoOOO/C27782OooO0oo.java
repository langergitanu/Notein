package o0OOoOOO;

import com.orion.notein.domain.models.folder.Folder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0OOOO0o.C27129OoooOOO;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import o0OOoooO.C28009OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OOoOOO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27782OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C28009OooOOOO f98143OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC27313OooOoo0 f98144OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C27129OoooOOO f98145OooO0OO;

    public C27782OooO0oo(C28009OooOOOO c28009OooOOOO, InterfaceC27313OooOoo0 noteMetaRepo, C27129OoooOOO c27129OoooOOO) {
        OooOOO0.OooO0oO(noteMetaRepo, "noteMetaRepo");
        this.f98143OooO00o = c28009OooOOOO;
        this.f98144OooO0O0 = noteMetaRepo;
        this.f98145OooO0OO = c27129OoooOOO;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0084 -> B:27:0x0088). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0096 -> B:34:0x009b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(C27782OooO0oo c27782OooO0oo, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27776OooO0O0 c27776OooO0O0;
        Iterator it;
        Collection collection;
        boolean z;
        c27782OooO0oo.getClass();
        if (abstractC32479OooO0OO instanceof C27776OooO0O0) {
            c27776OooO0O0 = (C27776OooO0O0) abstractC32479OooO0OO;
            int i = c27776OooO0O0.f98123OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27776OooO0O0.f98123OooOoo = i - Integer.MIN_VALUE;
            } else {
                c27776OooO0O0 = new C27776OooO0O0(c27782OooO0oo, abstractC32479OooO0OO);
            }
        }
        Object obj = c27776OooO0O0.f98122OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27776OooO0O0.f98123OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            ArrayList arrayList = new ArrayList();
            it = list.iterator();
            collection = arrayList;
            if (!it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = c27776OooO0O0.f98120OooOoO;
            it = c27776OooO0O0.f98121OooOoO0;
            collection = c27776OooO0O0.f98118OooOo;
            C27782OooO0oo c27782OooO0oo2 = c27776OooO0O0.f98119OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            Folder folder = (Folder) obj;
            if (folder != null || folder.getInTrashBin()) {
                Object next = obj2;
                c27782OooO0oo = c27782OooO0oo2;
                c27782OooO0oo2 = c27782OooO0oo;
                obj2 = next;
                z = false;
                if (z) {
                    collection.add(obj2);
                }
                c27782OooO0oo = c27782OooO0oo2;
                if (!it.hasNext()) {
                    next = it.next();
                    Folder folder2 = (Folder) next;
                    String parentId = folder2.getParentId();
                    if (parentId != null && OooOOO0.OooO0O0(folder2.getRecoverParentId(), parentId) && folder2.getInTrashBin()) {
                        C28009OooOOOO c28009OooOOOO = c27782OooO0oo.f98143OooO00o;
                        c27776OooO0O0.f98119OooOo0o = c27782OooO0oo;
                        c27776OooO0O0.f98118OooOo = collection;
                        c27776OooO0O0.f98121OooOoO0 = it;
                        c27776OooO0O0.f98120OooOoO = next;
                        c27776OooO0O0.f98123OooOoo = 1;
                        Folder folderOooO0Oo = c28009OooOOOO.OooO0Oo(parentId);
                        if (folderOooO0Oo == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                        c27782OooO0oo2 = c27782OooO0oo;
                        obj2 = next;
                        obj = folderOooO0Oo;
                        Folder folder3 = (Folder) obj;
                        if (folder3 != null) {
                        }
                        Object next2 = obj2;
                        c27782OooO0oo = c27782OooO0oo2;
                    }
                    c27782OooO0oo2 = c27782OooO0oo;
                    obj2 = next2;
                    z = false;
                    if (z) {
                    }
                    c27782OooO0oo = c27782OooO0oo2;
                    if (!it.hasNext()) {
                        return (List) collection;
                    }
                }
            } else {
                z = true;
                if (z) {
                }
                c27782OooO0oo = c27782OooO0oo2;
                if (!it.hasNext()) {
                }
            }
        }
    }
}
