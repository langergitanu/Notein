package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.o0OoOo0;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.feedback.FeedbackFragment;
import com.orion.notein.p607ui.noteeditor.audio.AudioBarChildFragment;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import java.util.ArrayList;
import java.util.List;
import o00o00.C25206OooO0Oo;
import o0OOoO0o.C27752OooO00o;
import o0Oo0oO.C28285OooO00o;
import o0OoOOo.C29153OooOoo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class OooOOOO implements SynchronizationGuard.CriticalSection, OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f67586OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f67587OooOo0o;

    public /* synthetic */ OooOOOO(Object obj, int i) {
        this.f67587OooOo0o = i;
        this.f67586OooOo = obj;
    }

    @Override // OooO0o.OooO00o
    public void OooO0O0(Object obj) {
        ClipData clipData;
        Uri data;
        Uri data2;
        int i = 0;
        int i2 = 1;
        Object obj2 = this.f67586OooOo;
        ActivityResult result = (ActivityResult) obj;
        switch (this.f67587OooOo0o) {
            case 1:
                kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
                Intent intent = result.f62239OooOo;
                if (intent == null) {
                    return;
                }
                FeedbackFragment feedbackFragment = (FeedbackFragment) obj2;
                C28285OooO00o c28285OooO00o = feedbackFragment.f71824Oooo0;
                if (c28285OooO00o == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("feedbackPicAdapter");
                    throw null;
                }
                int size = 6 - c28285OooO00o.f66021OooO00o.f65811OooO0o.size();
                if (size <= 0) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                ClipData clipData2 = intent.getClipData();
                if (clipData2 != null) {
                    int itemCount = clipData2.getItemCount();
                    while (i < itemCount) {
                        Uri uri = clipData2.getItemAt(i).getUri();
                        if (uri != null) {
                            arrayList.add(uri);
                        }
                        i++;
                    }
                } else {
                    Uri data3 = intent.getData();
                    if (data3 != null) {
                        arrayList.add(data3);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                List listO00Oo0 = OooOo.o00Oo0(arrayList, size);
                o0Oo0oO0.OooOOO OooOoO2 = feedbackFragment.OooOoO();
                if (!listO00Oo0.isEmpty()) {
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(OooOoO2);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new o0Oo0oO0.OooOOO0(OooOoO2, listO00Oo0, null), 2);
                }
                if (arrayList.size() > listO00Oo0.size()) {
                    ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = feedbackFragment.requireActivity();
                    kotlin.jvm.internal.OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity(...)");
                    String string = feedbackFragment.getString(R.string.feedback_content_pic_limit, 6);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    C25206OooO0Oo.OooO0oO(activityC21897OooOo0RequireActivity, string);
                    return;
                }
                return;
            case 2:
                kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
                AudioBarChildFragment audioBarChildFragment = (AudioBarChildFragment) obj2;
                C27752OooO00o c27752OooO00o = new C27752OooO00o(audioBarChildFragment, i2);
                ArrayList arrayList2 = new ArrayList();
                Intent intent2 = result.f62239OooOo;
                if (intent2 != null && (data = intent2.getData()) != null) {
                    if (!((Boolean) c27752OooO00o.invoke(data)).booleanValue()) {
                        data = null;
                    }
                    if (data != null) {
                        arrayList2.add(data);
                    }
                }
                if (intent2 != null && (clipData = intent2.getClipData()) != null) {
                    int itemCount2 = clipData.getItemCount();
                    while (i < itemCount2) {
                        Uri uri2 = clipData.getItemAt(i).getUri();
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(uri2);
                        if (((Boolean) c27752OooO00o.invoke(uri2)).booleanValue()) {
                            arrayList2.add(uri2);
                        }
                        i++;
                    }
                }
                if (!arrayList2.isEmpty()) {
                    com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooOoo0 = audioBarChildFragment.OooOoo0();
                    C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0oOooOoo0), null, null, new C29153OooOoo(oooO0oOooOoo0, arrayList2, null), 3);
                    return;
                }
                Context context = audioBarChildFragment.getContext();
                if (context != null) {
                    String string2 = audioBarChildFragment.getString(R.string.no_file_is_selected);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                    C25206OooO0Oo.OooO0oO(context, string2);
                    return;
                }
                return;
            default:
                kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
                Intent intent3 = result.f62239OooOo;
                if (intent3 == null || (data2 = intent3.getData()) == null) {
                    return;
                }
                ((NoteListContainerFragment) obj2).Oooo0(data2);
                return;
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        return ((WorkInitializer) this.f67586OooOo).lambda$ensureContextsScheduled$0();
    }
}
