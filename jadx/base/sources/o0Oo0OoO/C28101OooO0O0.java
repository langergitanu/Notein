package o0Oo0OoO;

import Oooo0OO.AbstractC20960OooOOOO;
import android.util.Log;
import com.orion.notein.data.p602db.entity.CommentEntity;
import com.orion.notein.domain.mapper.CommentMapper;
import com.orion.notein.domain.models.note.Comment;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0Oo0OoO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28101OooO0O0 extends AbstractC20960OooOOOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final o0OO00o0.OooOo00 f99588OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final CommentMapper f99589OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28101OooO0O0(o0OO00o0.OooOo00 oooOo00, CommentMapper commentMapper) {
        super(2);
        kotlin.jvm.internal.OooOOO0.OooO0oO(commentMapper, "commentMapper");
        this.f99588OooOo = oooOo00;
        this.f99589OooOoO0 = commentMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00000Oo(String str, Map map, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28100OooO00o c28100OooO00o;
        String str3;
        if (abstractC32479OooO0OO instanceof C28100OooO00o) {
            c28100OooO00o = (C28100OooO00o) abstractC32479OooO0OO;
            int i = c28100OooO00o.f99587OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28100OooO00o.f99587OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c28100OooO00o = new C28100OooO00o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c28100OooO00o.f99586OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28100OooO00o.f99587OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                ArrayList arrayListO00000 = o00000(CommentEntity.class, str + "/comment");
                ArrayList<CommentEntity> arrayList = new ArrayList();
                for (Object obj2 : arrayListO00000) {
                    if (map.containsKey(((CommentEntity) obj2).getPageId())) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (CommentEntity commentEntity : arrayList) {
                    String string = UUID.randomUUID().toString();
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                    String string2 = UUID.randomUUID().toString();
                    kotlin.jvm.internal.OooOOO0.OooO0o(string2, "toString(...)");
                    String quoteId = commentEntity.getQuoteId();
                    if (quoteId != null) {
                        map.put(quoteId, string);
                    }
                    map.put(commentEntity.getId(), string2);
                    Comment model = this.f99589OooOoO0.toModel(commentEntity);
                    String str4 = (String) map.get(commentEntity.getNoteId());
                    Comment commentCopy$default = null;
                    if (str4 != null && (str3 = (String) map.get(commentEntity.getPageId())) != null) {
                        commentCopy$default = Comment.copy$default(model, string2, null, str3, str4, string, System.currentTimeMillis(), System.currentTimeMillis(), null, 130, null);
                    }
                    if (commentCopy$default != null) {
                        arrayList2.add(commentCopy$default);
                    }
                }
                o0OO00o0.OooOo00 oooOo00 = this.f99588OooOo;
                c28100OooO00o.f99587OooOoO0 = 1;
                if (oooOo00.OooO00o(str2, arrayList2, c28100OooO00o) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return new Integer(0);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("comment", "Couldn't restore data. " + C32460OooOooO.f116667OooO00o);
            return new Integer(-999);
        }
    }
}
