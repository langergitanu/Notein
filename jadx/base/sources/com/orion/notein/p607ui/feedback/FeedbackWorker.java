package com.orion.notein.p607ui.feedback;

import OooOoo.C20593OooO0Oo;
import OooOooO.C20741OooOOoo;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Firebase;
import com.google.firebase.auth.AuthKt;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirestoreKt;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000oo0.C24684Oooo;
import o0O0oooo.C26372OooOOo;
import o0Oo0oO0.C28301OooOOo;
import o0Oo0oO0.C28303OooOOoo;
import o0Oo0oO0.C28304OooOo0;
import o0Oo0oO0.OooOo00;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/ui/feedback/FeedbackWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class FeedbackWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackWorker(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        OooOOO0.OooO0oO(appContext, "appContext");
        OooOOO0.OooO0oO(workerParams, "workerParams");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO(String str, int i, List list, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Exception {
        OooOo00 oooOo00;
        String str3;
        String str4;
        int i2;
        Object obj;
        FeedbackWorker feedbackWorker;
        String uid;
        Task<DocumentReference> task;
        if (abstractC32479OooO0OO instanceof OooOo00) {
            oooOo00 = (OooOo00) abstractC32479OooO0OO;
            int i3 = oooOo00.f100414OooOoo;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oooOo00.f100414OooOoo = i3 - Integer.MIN_VALUE;
            } else {
                oooOo00 = new OooOo00(this, abstractC32479OooO0OO);
            }
        }
        Object obj2 = oooOo00.f100413OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = oooOo00.f100414OooOoo;
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            oooOo00.f100410OooOo0o = this;
            str3 = str;
            oooOo00.f100409OooOo = str3;
            oooOo00.f100412OooOoO0 = str2;
            oooOo00.f100411OooOoO = i;
            oooOo00.f100414OooOoo = 1;
            Object objOooOO0 = OooOO0(list, oooOo00);
            if (objOooOO0 != enumC32485OooO00o) {
                str4 = str2;
                i2 = i;
                obj = objOooOO0;
                feedbackWorker = this;
            }
            return enumC32485OooO00o;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            task = (Task) oooOo00.f100410OooOo0o;
            C32446OooOOOo.OooO0O0(obj2);
            DocumentReference documentReference = (DocumentReference) obj2;
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("FeedbackWorker");
            c20358OooO00o.OooO0o0(OooO00o.OooO00o("Feedback sent. ", documentReference != null ? documentReference.getId() : null), new Object[0]);
            OooOOO0.OooO0o(task, "also(...)");
            return !task.isSuccessful() ? new ListenableWorker.OooO00o.OooO0OO() : new ListenableWorker.OooO00o.C19046OooO00o();
        }
        i2 = oooOo00.f100411OooOoO;
        str4 = oooOo00.f100412OooOoO0;
        String str5 = oooOo00.f100409OooOo;
        feedbackWorker = (FeedbackWorker) oooOo00.f100410OooOo0o;
        C32446OooOOOo.OooO0O0(obj2);
        obj = obj2;
        str3 = str5;
        List list2 = (List) obj;
        String strOooO0O0 = C20593OooO0Oo.OooO0O0("brand: ", Build.BRAND, ", flavor: google_play");
        String str6 = Build.MODEL;
        String str7 = feedbackWorker.f66669OooOo0o.getPackageManager().getPackageInfo(feedbackWorker.f66669OooOo0o.getPackageName(), 0).versionName;
        if (str7 == null) {
            str7 = "unknown";
        }
        String str8 = Build.VERSION.RELEASE;
        Firebase firebase = Firebase.INSTANCE;
        FirebaseUser currentUser = AuthKt.getAuth(firebase).getCurrentUser();
        if (currentUser == null || (uid = currentUser.getUid()) == null) {
            uid = "";
        }
        Task<DocumentReference> taskAdd = FirestoreKt.getFirestore(firebase).collection("feedback").add(C34444Oooo0O0.OooO0oo(new C32443OooOOO("brand", strOooO0O0), new C32443OooOOO("model", str6), new C32443OooOOO("app_version", str7), new C32443OooOOO("android_version", str8), new C32443OooOOO("email", str4), new C32443OooOOO("description", str3), new C32443OooOOO(C18437z2.f56754h, new Integer(i2)), new C32443OooOOO("img_urls", list2), new C32443OooOOO("firebase_uid", uid)));
        final C26372OooOOo c26372OooOOo = new C26372OooOOo(1);
        Task<DocumentReference> taskAddOnFailureListener = taskAdd.addOnSuccessListener(new OnSuccessListener() { // from class: o0Oo0oO0.OooOOo0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj3) throws Exception {
                c26372OooOOo.invoke(obj3);
            }
        }).addOnFailureListener(new C28301OooOOo());
        OooOOO0.OooO0Oo(taskAddOnFailureListener);
        oooOo00.f100410OooOo0o = taskAddOnFailureListener;
        oooOo00.f100409OooOo = null;
        oooOo00.f100412OooOoO0 = null;
        oooOo00.f100414OooOoo = 2;
        Object objOooO0o = C20741OooOOoo.OooO0o(taskAddOnFailureListener, oooOo00);
        if (objOooO0o != enumC32485OooO00o) {
            task = taskAddOnFailureListener;
            obj2 = objOooO0o;
            DocumentReference documentReference2 = (DocumentReference) obj2;
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("FeedbackWorker");
            c20358OooO00o2.OooO0o0(OooO00o.OooO00o("Feedback sent. ", documentReference2 != null ? documentReference2.getId() : null), new Object[0]);
            OooOOO0.OooO0o(task, "also(...)");
            if (!task.isSuccessful()) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r12v0, types: [androidx.work.ListenableWorker, com.orion.notein.ui.feedback.FeedbackWorker] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [oOo000Oo.OooOoO] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oo(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28303OooOOoo c28303OooOOoo;
        ?? arrayList;
        if (abstractC32479OooO0OO instanceof C28303OooOOoo) {
            c28303OooOOoo = (C28303OooOOoo) abstractC32479OooO0OO;
            int i = c28303OooOOoo.f100401OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28303OooOOoo.f100401OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c28303OooOOoo = new C28303OooOOoo(this, abstractC32479OooO0OO);
            }
        }
        C28303OooOOoo c28303OooOOoo2 = c28303OooOOoo;
        Object objOooO = c28303OooOOoo2.f100400OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28303OooOOoo2.f100401OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO);
                WorkerParameters workerParameters = this.f66668OooOo;
                String strOooO0O0 = workerParameters.f66692OooO0O0.OooO0O0("key_feedback_content");
                if (strOooO0O0 == null || strOooO0O0.length() == 0) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("FeedbackWorker");
                    c20358OooO00o.OooO0OO("Content is null or empty.", new Object[0]);
                    return new ListenableWorker.OooO00o.C19046OooO00o();
                }
                Object obj = workerParameters.f66692OooO0O0.f66686OooO00o.get("key_feedback_type");
                int iIntValue = obj instanceof Integer ? ((Integer) obj).intValue() : -1;
                if (iIntValue == -1) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("FeedbackWorker");
                    c20358OooO00o2.OooO0OO("Type is unknown.", new Object[0]);
                    return new ListenableWorker.OooO00o.C19046OooO00o();
                }
                Object obj2 = workerParameters.f66692OooO0O0.f66686OooO00o.get("key_image_uri_list");
                String[] strArr = obj2 instanceof String[] ? (String[]) obj2 : null;
                if (strArr != null) {
                    arrayList = new ArrayList(strArr.length);
                    for (String str : strArr) {
                        arrayList.add(Uri.parse(str));
                    }
                } else {
                    arrayList = C34434OooOoO.f123453OooOo0o;
                }
                ?? r4 = arrayList;
                String strOooO0O02 = workerParameters.f66692OooO0O0.OooO0O0("key_feedback_email");
                if (strOooO0O02 == null) {
                    strOooO0O02 = "";
                }
                String str2 = strOooO0O02;
                c28303OooOOoo2.f100401OooOoO0 = 1;
                objOooO = OooO(strOooO0O0, iIntValue, r4, str2, c28303OooOOoo2);
                if (objOooO == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO);
            }
            return (ListenableWorker.OooO00o) objOooO;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooO0OO(C24684Oooo.OooO0O0(c20358OooO00o3, "FeedbackWorker", "Feedback failed. ", e), new Object[0]);
            return new ListenableWorker.OooO00o.C19046OooO00o();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00d5 -> B:29:0x00d8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00e9 -> B:17:0x0054). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0(List list, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Exception {
        C28304OooOo0 c28304OooOo0;
        List arrayList;
        Iterator it;
        UploadTask uploadTask;
        Iterator it2;
        StorageReference storageReference;
        if (abstractC32479OooO0OO instanceof C28304OooOo0) {
            c28304OooOo0 = (C28304OooOo0) abstractC32479OooO0OO;
            int i = c28304OooOo0.f100407OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28304OooOo0.f100407OooOoo = i - Integer.MIN_VALUE;
            } else {
                c28304OooOo0 = new C28304OooOo0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c28304OooOo0.f100406OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28304OooOo0.f100407OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            arrayList = new ArrayList();
            it = list.iterator();
            if (!it.hasNext()) {
            }
        } else if (i2 == 1) {
            uploadTask = c28304OooOo0.f100404OooOoO;
            storageReference = c28304OooOo0.f100405OooOoO0;
            it2 = c28304OooOo0.f100402OooOo;
            List list2 = c28304OooOo0.f100403OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            arrayList = list2;
            OooOOO0.OooO0o(uploadTask, "also(...)");
            if (uploadTask.isSuccessful()) {
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c28304OooOo0.f100402OooOo;
            List list3 = c28304OooOo0.f100403OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            String string = ((Uri) obj).toString();
            OooOOO0.OooO0o(string, "toString(...)");
            list3.add(string);
            arrayList = list3;
            if (!it.hasNext()) {
                Uri uri = (Uri) it.next();
                FirebaseStorage firebaseStorage = FirebaseStorage.getInstance();
                OooOOO0.OooO0o(firebaseStorage, "getInstance(...)");
                StorageReference reference = firebaseStorage.getReference();
                OooOOO0.OooO0o(reference, "getReference(...)");
                StorageReference storageReferenceChild = reference.child("feedback_img/" + UUID.randomUUID());
                OooOOO0.OooO0o(storageReferenceChild, "child(...)");
                UploadTask uploadTaskPutFile = storageReferenceChild.putFile(uri);
                OooOOO0.OooO0Oo(uploadTaskPutFile);
                c28304OooOo0.f100403OooOo0o = arrayList;
                c28304OooOo0.f100402OooOo = it;
                c28304OooOo0.f100405OooOoO0 = storageReferenceChild;
                c28304OooOo0.f100404OooOoO = uploadTaskPutFile;
                c28304OooOo0.f100407OooOoo = 1;
                if (C20741OooOOoo.OooO0o(uploadTaskPutFile, c28304OooOo0) != enumC32485OooO00o) {
                    it2 = it;
                    uploadTask = uploadTaskPutFile;
                    storageReference = storageReferenceChild;
                    OooOOO0.OooO0o(uploadTask, "also(...)");
                    if (uploadTask.isSuccessful()) {
                        it = it2;
                        if (!it.hasNext()) {
                        }
                    } else {
                        Task<Uri> downloadUrl = storageReference.getDownloadUrl();
                        OooOOO0.OooO0o(downloadUrl, "getDownloadUrl(...)");
                        c28304OooOo0.f100403OooOo0o = arrayList;
                        c28304OooOo0.f100402OooOo = it2;
                        c28304OooOo0.f100405OooOoO0 = null;
                        c28304OooOo0.f100404OooOoO = null;
                        c28304OooOo0.f100407OooOoo = 2;
                        Object objOooO0o = C20741OooOOoo.OooO0o(downloadUrl, c28304OooOo0);
                        if (objOooO0o != enumC32485OooO00o) {
                            list3 = arrayList;
                            obj = objOooO0o;
                            it = it2;
                            String string2 = ((Uri) obj).toString();
                            OooOOO0.OooO0o(string2, "toString(...)");
                            list3.add(string2);
                            arrayList = list3;
                            if (!it.hasNext()) {
                                return arrayList;
                            }
                        }
                    }
                }
                return enumC32485OooO00o;
            }
        }
    }
}
