package o0OoooOo;

import android.graphics.Point;
import android.graphics.RectF;
import com.orion.notein.domain.models.note.Comment;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.Quote;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.CommentVO;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import o0OOooo0.C27985OooO0o;
import o0OOooo0.C27994OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32512OooOo0;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OoooOo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentViewModel$comments$1", m80623f = "EditorCommentViewModel.kt", m80624l = {109}, m80625m = "invokeSuspend")
public final class C29650OooOOo extends AbstractC32476OooO implements InterfaceC32512OooOo0<NoteContent, List<? extends Comment>, String, String, com.orion.notein.p607ui.p609vo.OooO00o, String, Continuation<? super List<? extends CommentVO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Collection f105114OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C29652OooOOoo f105115OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Comment f105116OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f105117OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Collection f105118OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f105119OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f105120OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public /* synthetic */ Object f105121OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public /* synthetic */ Object f105122OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public /* synthetic */ String f105123Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public /* synthetic */ Object f105124Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public /* synthetic */ Serializable f105125Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public /* synthetic */ Object f105126Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final /* synthetic */ C29652OooOOoo f105127Oooo0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29650OooOOo(Continuation continuation, C29652OooOOoo c29652OooOOoo) {
        super(7, continuation);
        this.f105127Oooo0O0 = c29652OooOOoo;
    }

    @Override // oO0O000o.InterfaceC32512OooOo0
    public final Object OoooO0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        C29650OooOOo c29650OooOOo = new C29650OooOOo((Continuation) serializable, this.f105127Oooo0O0);
        c29650OooOOo.f105121OooOooO = (NoteContent) obj;
        c29650OooOOo.f105122OooOooo = (List) obj2;
        c29650OooOOo.f105124Oooo000 = (String) obj3;
        c29650OooOOo.f105125Oooo00O = (String) obj4;
        c29650OooOOo.f105126Oooo00o = (com.orion.notein.p607ui.p609vo.OooO00o) obj5;
        c29650OooOOo.f105123Oooo0 = (String) obj6;
        return c29650OooOOo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c5  */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v11, types: [T, java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x012b -> B:30:0x012e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0136 -> B:31:0x0131). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        com.orion.notein.p607ui.p609vo.OooO00o oooO00o;
        Iterator it;
        SimpleDateFormat simpleDateFormat;
        C29652OooOOoo c29652OooOOoo;
        List list;
        String str2;
        String str3;
        Collection collection;
        Object next;
        int iIntValue;
        Object next2;
        Point point;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105119OooOoo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            NoteContent noteContent = (NoteContent) this.f105121OooOooO;
            List list2 = (List) this.f105122OooOooo;
            String str4 = (String) this.f105124Oooo000;
            String str5 = (String) this.f105125Oooo00O;
            com.orion.notein.p607ui.p609vo.OooO00o oooO00o2 = (com.orion.notein.p607ui.p609vo.OooO00o) this.f105126Oooo00o;
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(this.f105123Oooo0, Locale.getDefault());
            List<Page> pages = noteContent.getPages();
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(pages, 10));
            Iterator<T> it2 = pages.iterator();
            while (it2.hasNext()) {
                arrayList.add(((Page) it2.next()).getId());
            }
            String id = noteContent.getId();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                Comment comment = (Comment) obj2;
                if (str5.length() == 0 || C33599OooOo0O.OooOoOO(comment.getTitle(), str5, true)) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
            str = str5;
            oooO00o = oooO00o2;
            it = arrayList2.iterator();
            simpleDateFormat = simpleDateFormat2;
            c29652OooOOoo = this.f105127Oooo0O0;
            list = arrayList;
            str2 = id;
            str3 = str4;
            collection = arrayList3;
            if (!it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = this.f105120OooOoo0;
            collection = this.f105118OooOoOO;
            Comment comment2 = this.f105116OooOoO;
            it = this.f105117OooOoO0;
            Collection collection2 = this.f105114OooOo;
            c29652OooOOoo = this.f105115OooOo0o;
            str2 = this.f105123Oooo0;
            list = (List) this.f105126Oooo00o;
            simpleDateFormat = (SimpleDateFormat) this.f105125Oooo00O;
            oooO00o = (com.orion.notein.p607ui.p609vo.OooO00o) this.f105124Oooo000;
            str = (String) this.f105122OooOooo;
            String str6 = (String) this.f105121OooOooO;
            C32446OooOOOo.OooO0O0(obj);
            String str7 = str6;
            int i3 = i2;
            Object objOooO0o = obj;
            Quote quote = (Quote) objOooO0o;
            String str8 = str7;
            String str9 = str;
            int i4 = i3;
            String str10 = simpleDateFormat.format(new Long(comment2.getCreationTime()));
            if (quote != null) {
                RectF boundingBox = quote.getBoundingBox(1.0f);
                point = new Point((int) boundingBox.centerX(), (int) boundingBox.centerY());
            } else {
                point = new Point(0, 0);
            }
            Point point2 = point;
            String id2 = comment2.getId();
            String title = comment2.getTitle();
            String str11 = str8;
            boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(comment2.getId(), str11);
            int bgColor = quote != null ? quote.getBgColor() : 0;
            int underlineColor = quote != null ? quote.getUnderlineColor() : 0;
            Integer num = quote != null ? new Integer(quote.getType()) : null;
            long creationTime = comment2.getCreationTime();
            kotlin.jvm.internal.OooOOO0.OooO0Oo(str10);
            collection.add(new CommentVO(id2, i4, title, zOooO0O0, bgColor, underlineColor, num, point2, str9, creationTime, str10, comment2.getLastModificationTime(), comment2.getSortKey()));
            str3 = str11;
            collection = collection2;
            str = str9;
            if (!it.hasNext()) {
                comment2 = (Comment) it.next();
                int iIndexOf = list.indexOf(comment2.getPageId());
                String quoteId = comment2.getQuoteId();
                if (quoteId != null) {
                    C27994OooOOOO c27994OooOOOO = c29652OooOOoo.f105131OooO0Oo;
                    this.f105121OooOooO = str3;
                    this.f105122OooOooo = str;
                    this.f105124Oooo000 = oooO00o;
                    this.f105125Oooo00O = simpleDateFormat;
                    this.f105126Oooo00o = list;
                    this.f105123Oooo0 = str2;
                    this.f105115OooOo0o = c29652OooOOoo;
                    Collection collection3 = collection;
                    this.f105114OooOo = collection3;
                    this.f105117OooOoO0 = it;
                    this.f105116OooOoO = comment2;
                    this.f105118OooOoOO = collection3;
                    this.f105120OooOoo0 = iIndexOf;
                    this.f105119OooOoo = 1;
                    c27994OooOOOO.getClass();
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    String str12 = str3;
                    i3 = iIndexOf;
                    objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27985OooO0o(c27994OooOOOO, quoteId, str2, null), this);
                    if (objOooO0o == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    str7 = str12;
                    collection2 = collection;
                    Quote quote2 = (Quote) objOooO0o;
                    String str82 = str7;
                    String str92 = str;
                    int i42 = i3;
                    String str102 = simpleDateFormat.format(new Long(comment2.getCreationTime()));
                    if (quote2 != null) {
                    }
                    Point point22 = point;
                    String id22 = comment2.getId();
                    String title2 = comment2.getTitle();
                    String str112 = str82;
                    boolean zOooO0O02 = kotlin.jvm.internal.OooOOO0.OooO0O0(comment2.getId(), str112);
                    if (quote2 != null) {
                    }
                    if (quote2 != null) {
                    }
                    if (quote2 != null) {
                    }
                    long creationTime2 = comment2.getCreationTime();
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(str102);
                    collection.add(new CommentVO(id22, i42, title2, zOooO0O02, bgColor, underlineColor, num, point22, str92, creationTime2, str102, comment2.getLastModificationTime(), comment2.getSortKey()));
                    str3 = str112;
                    collection = collection2;
                    str = str92;
                    if (!it.hasNext()) {
                        List list3 = (List) collection;
                        if (oooO00o == com.orion.notein.p607ui.p609vo.OooO00o.f80089OooOoo0) {
                            final C29645OooOO0o c29645OooOO0o = new C29645OooOO0o(oooO00o);
                            return oOo000Oo.OooOo.o00O0O(list3, new Comparator() { // from class: o0OoooOo.OooOOO0
                                @Override // java.util.Comparator
                                public final int compare(Object obj3, Object obj4) {
                                    return ((Number) c29645OooOO0o.invoke(obj3, obj4)).intValue();
                                }
                            });
                        }
                        List list4 = list3;
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj3 : list4) {
                            if (((CommentVO) obj3).getSortKey() == null) {
                                arrayList4.add(obj3);
                            }
                        }
                        final C29646OooOOO c29646OooOOO = new C29646OooOOO(oooO00o);
                        List<CommentVO> listO00O0O = oOo000Oo.OooOo.o00O0O(arrayList4, new Comparator() { // from class: o0OoooOo.OooOOOO
                            @Override // java.util.Comparator
                            public final int compare(Object obj4, Object obj5) {
                                return ((Number) c29646OooOOO.invoke(obj4, obj5)).intValue();
                            }
                        });
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj4 : list4) {
                            if (((CommentVO) obj4).getSortKey() != null) {
                                arrayList5.add(obj4);
                            }
                        }
                        ?? O00O0O = oOo000Oo.OooOo.o00O0O(arrayList5, new C29651OooOOo0(new C29649OooOOOo(oooO00o, 0), 0));
                        if (O00O0O.isEmpty()) {
                            return listO00O0O;
                        }
                        C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
                        c24034Oooo00O.f80942OooOo0o = O00O0O;
                        for (CommentVO commentVO : listO00O0O) {
                            Iterable iterable = (Iterable) c24034Oooo00O.f80942OooOo0o;
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj5 : iterable) {
                                if (((CommentVO) obj5).getPageIndex() <= commentVO.getPageIndex()) {
                                    arrayList6.add(obj5);
                                }
                            }
                            Iterator it3 = arrayList6.iterator();
                            if (it3.hasNext()) {
                                next = it3.next();
                                if (it3.hasNext()) {
                                    int pageIndex = ((CommentVO) next).getPageIndex();
                                    do {
                                        Object next3 = it3.next();
                                        int pageIndex2 = ((CommentVO) next3).getPageIndex();
                                        if (pageIndex < pageIndex2) {
                                            next = next3;
                                            pageIndex = pageIndex2;
                                        }
                                    } while (it3.hasNext());
                                }
                            } else {
                                next = null;
                            }
                            CommentVO commentVO2 = (CommentVO) next;
                            if (commentVO2 != null) {
                                Iterable iterable2 = (Iterable) c24034Oooo00O.f80942OooOo0o;
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj6 : iterable2) {
                                    if (((CommentVO) obj6).getPageIndex() == commentVO2.getPageIndex()) {
                                        arrayList7.add(obj6);
                                    }
                                }
                                Iterator it4 = arrayList7.iterator();
                                if (it4.hasNext()) {
                                    next2 = it4.next();
                                    if (it4.hasNext()) {
                                        long creationTime3 = ((CommentVO) next2).getCreationTime();
                                        do {
                                            Object next4 = it4.next();
                                            long creationTime4 = ((CommentVO) next4).getCreationTime();
                                            if (creationTime3 < creationTime4) {
                                                next2 = next4;
                                                creationTime3 = creationTime4;
                                            }
                                        } while (it4.hasNext());
                                    }
                                } else {
                                    next2 = null;
                                }
                                CommentVO commentVO3 = (CommentVO) next2;
                                Integer num2 = commentVO3 != null ? new Integer(((List) c24034Oooo00O.f80942OooOo0o).indexOf(commentVO3)) : null;
                                iIntValue = num2 != null ? num2.intValue() : -1;
                            }
                            ?? O0ooOoO = oOo000Oo.OooOo.o0ooOoO((Collection) c24034Oooo00O.f80942OooOo0o);
                            O0ooOoO.add(iIntValue + 1, commentVO);
                            c24034Oooo00O.f80942OooOo0o = O0ooOoO;
                        }
                        return (List) c24034Oooo00O.f80942OooOo0o;
                    }
                } else {
                    i3 = iIndexOf;
                    str82 = str3;
                    quote2 = null;
                    collection2 = collection;
                    String str922 = str;
                    int i422 = i3;
                    String str1022 = simpleDateFormat.format(new Long(comment2.getCreationTime()));
                    if (quote2 != null) {
                    }
                    Point point222 = point;
                    String id222 = comment2.getId();
                    String title22 = comment2.getTitle();
                    String str1122 = str82;
                    boolean zOooO0O022 = kotlin.jvm.internal.OooOOO0.OooO0O0(comment2.getId(), str1122);
                    if (quote2 != null) {
                    }
                    if (quote2 != null) {
                    }
                    if (quote2 != null) {
                    }
                    long creationTime22 = comment2.getCreationTime();
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(str1022);
                    collection.add(new CommentVO(id222, i422, title22, zOooO0O022, bgColor, underlineColor, num, point222, str922, creationTime22, str1022, comment2.getLastModificationTime(), comment2.getSortKey()));
                    str3 = str1122;
                    collection = collection2;
                    str = str922;
                    if (!it.hasNext()) {
                    }
                }
            }
        }
    }
}
