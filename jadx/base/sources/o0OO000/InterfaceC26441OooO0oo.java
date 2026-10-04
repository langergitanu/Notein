package o0OO000;

import com.orion.notein.domain.models.note.NoteMeta;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o0OOOo0.C27174OooO0O0;
import oOO00oOo.InterfaceC34386OooO;
import oOO00oOo.InterfaceC34387OooO00o;
import oOO00oOo.InterfaceC34388OooO0O0;
import oOO00oOo.InterfaceC34391OooO0o;
import oOO00oOo.InterfaceC34398OooOOOo;
import oOO00oOo.InterfaceC34401OooOOoo;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: renamed from: o0OO000.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u00042\b\b\u0001\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u0010\u0010\u0011JD\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00050\u00042\b\b\u0001\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u0012\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016J0\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00050\u00042\b\b\u0001\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u0012\u001a\u00020\tH§@¢\u0006\u0004\b\u0018\u0010\u0011J<\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00050\u00042\b\b\u0001\u0010\u000e\u001a\u00020\t2\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0003\u0010\u001c\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001e\u0010\u001fJD\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00050\u00042\b\b\u0001\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u0012\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020 H§@¢\u0006\u0004\b\"\u0010#JD\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00050\u00042\b\b\u0001\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u0012\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020$H§@¢\u0006\u0004\b&\u0010'J0\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020(H§@¢\u0006\u0004\b*\u0010+J6\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020,H§@¢\u0006\u0004\b/\u00100J@\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020-0\u00050\u00042\b\b\u0001\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u000201H§@¢\u0006\u0004\b3\u00104J@\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060-0\u00050\u00042\b\b\u0001\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u000205H§@¢\u0006\u0004\b7\u00108JD\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\u00050\u00042\b\b\u0001\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u0012\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u000209H§@¢\u0006\u0004\b;\u0010<JD\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00050\u00042\b\b\u0001\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u0012\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020=H§@¢\u0006\u0004\b>\u0010?ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006@À\u0006\u0001"}, m80612d2 = {"Lo0OO000/OooO0oo;", "", "Lo0OO000/OooO00o;", "request", "LooooOOo0/OooOoO;", "Lo0OOOo0/OooO0O0;", "Lo0OO000/OooO0O0;", "OooO0oO", "(Lo0OO000/OooO00o;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "lockToken", "Lo0OO000/OooOoO;", "OooO0O0", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "driveId", "Lo0OO000/OooOoO0;", "OooOO0o", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", NoteMeta.PROPERTY_NOTE_ID, "Lo0OO000/OooOoo0;", "Lo0OO000/OooOoOO;", "OooO00o", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo0OO000/OooOoo0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo0OO000/OooOOoo;", "OooOOO", "", "cursor", "", "limit", "Lo0OO000/OooOOOO;", "OooOO0", "(Ljava/lang/String;Ljava/lang/Long;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo0OO000/OooOo00;", "Lo0OO000/OooOo0;", "OooOOO0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo0OO000/OooOo00;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo0OO000/OooOO0O;", "Lo0OO000/OooOO0o;", "OooO0oo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo0OO000/OooOO0O;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo0OO000/OooOo0O;", "Lo0OO000/OooOo0o;", "OooO0OO", "(Ljava/lang/String;Lo0OO000/OooOo0O;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo0OO000/OooO0oO;", "", "Lo0OO000/OooOo;", "OooOO0O", "(Ljava/lang/String;Lo0OO000/OooO0oO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo0OO000/OooO0o;", "Lo0OO000/OooOOo;", "OooO0o0", "(Ljava/lang/String;Ljava/lang/String;Lo0OO000/OooO0o;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo0OO000/OooO0Oo;", "Lo0OO000/OooO0o0;", "OooO", "(Ljava/lang/String;Ljava/lang/String;Lo0OO000/OooO0Oo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo0OO000/OooOOO0;", "Lo0OO000/OooOOO;", "OooO0Oo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo0OO000/OooOOO0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo0OO000/OooOOo0;", "OooO0o", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo0OO000/OooOOo0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public interface InterfaceC26441OooO0oo {
    @oOO00oOo.OooOOOO("/cloudsync/v1/drives/{drive_id}/notes/meta/batch-delete")
    Object OooO(@InterfaceC34401OooOOoo("drive_id") String str, @InterfaceC34386OooO("X-Lock-Token") String str2, @InterfaceC34387OooO00o C26438OooO0Oo c26438OooO0Oo, Continuation<? super C35238OooOoO<C27174OooO0O0<List<C26439OooO0o0>>>> continuation);

    @InterfaceC34398OooOOOo("/cloudsync/v1/drives/{drive_id}/notes/{note_id}/meta")
    Object OooO00o(@InterfaceC34401OooOOoo("drive_id") String str, @InterfaceC34401OooOOoo("note_id") String str2, @InterfaceC34386OooO("X-Lock-Token") String str3, @InterfaceC34387OooO00o C26453OooOoo0 c26453OooOoo0, Continuation<? super C35238OooOoO<C27174OooO0O0<C26452OooOoOO>>> continuation);

    @oOO00oOo.OooOOO("/cloudsync/v1/locks/{lock_token}")
    Object OooO0O0(@InterfaceC34401OooOOoo("lock_token") String str, Continuation<? super C35238OooOoO<C27174OooO0O0<C26450OooOoO>>> continuation);

    @oOO00oOo.OooOOOO("/cloudsync/v1/content/reconcile")
    Object OooO0OO(@InterfaceC34386OooO("X-Lock-Token") String str, @InterfaceC34387OooO00o C26448OooOo0O c26448OooOo0O, Continuation<? super C35238OooOoO<C27174OooO0O0<C26449OooOo0o>>> continuation);

    @oOO00oOo.OooOOOO("/cloudsync/v1/drives/{drive_id}/notes/{note_id}/meta/delete")
    Object OooO0Oo(@InterfaceC34401OooOOoo("drive_id") String str, @InterfaceC34401OooOOoo("note_id") String str2, @InterfaceC34386OooO("X-Lock-Token") String str3, @InterfaceC34387OooO00o OooOOO0 oooOOO0, Continuation<? super C35238OooOoO<C27174OooO0O0<OooOOO>>> continuation);

    @oOO00oOo.OooOOOO("/cloudsync/v1/drives/{drive_id}/notes/{note_id}/meta/migrate")
    Object OooO0o(@InterfaceC34401OooOOoo("drive_id") String str, @InterfaceC34401OooOOoo("note_id") String str2, @InterfaceC34386OooO("X-Lock-Token") String str3, @InterfaceC34387OooO00o C26445OooOOo0 c26445OooOOo0, Continuation<? super C35238OooOoO<C27174OooO0O0<C26452OooOoOO>>> continuation);

    @oOO00oOo.OooOOOO("/cloudsync/v1/drives/{drive_id}/notes/meta/batch-migrate")
    Object OooO0o0(@InterfaceC34401OooOOoo("drive_id") String str, @InterfaceC34386OooO("X-Lock-Token") String str2, @InterfaceC34387OooO00o OooO0o oooO0o, Continuation<? super C35238OooOoO<C27174OooO0O0<List<C26444OooOOo>>>> continuation);

    @oOO00oOo.OooOOOO("/cloudsync/v1/locks")
    Object OooO0oO(@InterfaceC34387OooO00o OooO00o oooO00o, Continuation<? super C35238OooOoO<C27174OooO0O0<OooO0O0>>> continuation);

    @oOO00oOo.OooOOOO("/cloudsync/v1/drives/{drive_id}/notes/{note_id}/commit")
    Object OooO0oo(@InterfaceC34401OooOOoo("drive_id") String str, @InterfaceC34401OooOOoo("note_id") String str2, @InterfaceC34386OooO("X-Lock-Token") String str3, @InterfaceC34387OooO00o OooOO0O oooOO0O, Continuation<? super C35238OooOoO<C27174OooO0O0<C26442OooOO0o>>> continuation);

    @InterfaceC34391OooO0o("/cloudsync/v1/drives/{drive_id}/notes/incremental")
    Object OooOO0(@InterfaceC34401OooOOoo("drive_id") String str, @oOO00oOo.OooOo00("cursor") Long l, @oOO00oOo.OooOo00("limit") int i, Continuation<? super C35238OooOoO<C27174OooO0O0<OooOOOO>>> continuation);

    @oOO00oOo.OooOOOO("/cloudsync/v1/content/batch-reconcile")
    Object OooOO0O(@InterfaceC34386OooO("X-Lock-Token") String str, @InterfaceC34387OooO00o C26440OooO0oO c26440OooO0oO, Continuation<? super C35238OooOoO<C27174OooO0O0<List<OooOo>>>> continuation);

    @InterfaceC34388OooO0O0("/cloudsync/v1/locks/{drive_id}/{lock_token}")
    Object OooOO0o(@InterfaceC34401OooOOoo("drive_id") String str, @InterfaceC34401OooOOoo("lock_token") String str2, Continuation<? super C35238OooOoO<C27174OooO0O0<C26451OooOoO0>>> continuation);

    @InterfaceC34391OooO0o("/cloudsync/v1/drives/{drive_id}/notes/{note_id}")
    Object OooOOO(@InterfaceC34401OooOOoo("drive_id") String str, @InterfaceC34401OooOOoo("note_id") String str2, Continuation<? super C35238OooOoO<C27174OooO0O0<C26446OooOOoo>>> continuation);

    @oOO00oOo.OooOOOO("/cloudsync/v1/drives/{drive_id}/notes/{note_id}/preupload")
    Object OooOOO0(@InterfaceC34401OooOOoo("drive_id") String str, @InterfaceC34401OooOOoo("note_id") String str2, @InterfaceC34386OooO("X-Lock-Token") String str3, @InterfaceC34387OooO00o OooOo00 oooOo00, Continuation<? super C35238OooOoO<C27174OooO0O0<C26447OooOo0>>> continuation);
}
