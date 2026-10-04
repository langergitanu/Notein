package com.google.firebase.storage;

import android.net.Uri;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.StorageMetadata;
import com.google.firebase.storage.StreamDownloadTask;
import com.google.firebase.storage.UploadTask;
import com.huawei.hms.network.embedded.C18374u4;
import java.io.InputStream;
import java.util.List;
import kotlin.Metadata;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0Oo.InterfaceC33721OooO0o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b\u001a!\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\t\u001a!\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0018\u0010\u0014\u001a\u00020\u0013*\u00060\u0011R\u00020\u0012H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0018\u0010\u0016\u001a\u00020\u0013*\u00060\u0011R\u00020\u0012H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u000e*\u00060\u0011R\u00020\u0012H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\u00060\u0011R\u00020\u0012H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0018\u0010\u0014\u001a\u00020\u0013*\u00060\u001cR\u00020\u001dH\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u001e\u001a\u0018\u0010\u0016\u001a\u00020\u0013*\u00060\u001cR\u00020\u001dH\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u001e\u001a\u0018\u0010\u0017\u001a\u00020\u001f*\u00060\u001cR\u00020\u001dH\u0086\u0002¢\u0006\u0004\b\u0017\u0010 \u001a\u0018\u0010\u0014\u001a\u00020\u0013*\u00060!R\u00020\"H\u0086\u0002¢\u0006\u0004\b\u0014\u0010#\u001a\u0018\u0010\u0016\u001a\u00020\u0013*\u00060!R\u00020\"H\u0086\u0002¢\u0006\u0004\b\u0016\u0010#\u001a\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020&0%*\u00020$H\u0086\u0002¢\u0006\u0004\b\u0014\u0010'\u001a\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020&0%*\u00020$H\u0086\u0002¢\u0006\u0004\b\u0016\u0010'\u001a\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0001*\u00020$H\u0086\u0002¢\u0006\u0004\b\u0017\u0010(\"\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b)\u0010*\";\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000/0.\"\u0012\b\u0000\u0010-*\f0+R\b\u0012\u0004\u0012\u00028\u00000,*\b\u0012\u0004\u0012\u00028\u00000,8F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, m80612d2 = {"Lcom/google/firebase/Firebase;", "", "url", "Lcom/google/firebase/storage/FirebaseStorage;", "storage", "(Lcom/google/firebase/Firebase;Ljava/lang/String;)Lcom/google/firebase/storage/FirebaseStorage;", "Lcom/google/firebase/FirebaseApp;", "app", "(Lcom/google/firebase/Firebase;Lcom/google/firebase/FirebaseApp;)Lcom/google/firebase/storage/FirebaseStorage;", "(Lcom/google/firebase/Firebase;Lcom/google/firebase/FirebaseApp;Ljava/lang/String;)Lcom/google/firebase/storage/FirebaseStorage;", "Lkotlin/Function1;", "Lcom/google/firebase/storage/StorageMetadata$Builder;", "LoO00ooO/OooOooO;", C18374u4.f56270c, "Lcom/google/firebase/storage/StorageMetadata;", "storageMetadata", "(LoO0O000o/OooOO0o;)Lcom/google/firebase/storage/StorageMetadata;", "Lcom/google/firebase/storage/UploadTask$TaskSnapshot;", "Lcom/google/firebase/storage/UploadTask;", "", "component1", "(Lcom/google/firebase/storage/UploadTask$TaskSnapshot;)J", "component2", "component3", "(Lcom/google/firebase/storage/UploadTask$TaskSnapshot;)Lcom/google/firebase/storage/StorageMetadata;", "Landroid/net/Uri;", "component4", "(Lcom/google/firebase/storage/UploadTask$TaskSnapshot;)Landroid/net/Uri;", "Lcom/google/firebase/storage/StreamDownloadTask$TaskSnapshot;", "Lcom/google/firebase/storage/StreamDownloadTask;", "(Lcom/google/firebase/storage/StreamDownloadTask$TaskSnapshot;)J", "Ljava/io/InputStream;", "(Lcom/google/firebase/storage/StreamDownloadTask$TaskSnapshot;)Ljava/io/InputStream;", "Lcom/google/firebase/storage/FileDownloadTask$TaskSnapshot;", "Lcom/google/firebase/storage/FileDownloadTask;", "(Lcom/google/firebase/storage/FileDownloadTask$TaskSnapshot;)J", "Lcom/google/firebase/storage/ListResult;", "", "Lcom/google/firebase/storage/StorageReference;", "(Lcom/google/firebase/storage/ListResult;)Ljava/util/List;", "(Lcom/google/firebase/storage/ListResult;)Ljava/lang/String;", "getStorage", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/storage/FirebaseStorage;", "Lcom/google/firebase/storage/StorageTask$SnapshotBase;", "Lcom/google/firebase/storage/StorageTask;", "T", "LoO0o0Oo/OooO0o;", "Lcom/google/firebase/storage/TaskState;", "getTaskState", "(Lcom/google/firebase/storage/StorageTask;)LoO0o0Oo/OooO0o;", "taskState", "com.google.firebase-firebase-storage"}, m80613k = 2, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class StorageKt {
    public static final long component1(UploadTask.TaskSnapshot taskSnapshot) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(taskSnapshot, "<this>");
        return taskSnapshot.getBytesTransferred();
    }

    public static final long component2(UploadTask.TaskSnapshot taskSnapshot) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(taskSnapshot, "<this>");
        return taskSnapshot.getTotalByteCount();
    }

    public static final StorageMetadata component3(UploadTask.TaskSnapshot taskSnapshot) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(taskSnapshot, "<this>");
        return taskSnapshot.getMetadata();
    }

    public static final Uri component4(UploadTask.TaskSnapshot taskSnapshot) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(taskSnapshot, "<this>");
        return taskSnapshot.getUploadSessionUri();
    }

    public static final FirebaseStorage getStorage(Firebase firebase) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(firebase, "<this>");
        FirebaseStorage firebaseStorage = FirebaseStorage.getInstance();
        kotlin.jvm.internal.OooOOO0.OooO0o(firebaseStorage, "getInstance(...)");
        return firebaseStorage;
    }

    public static final <T extends StorageTask<T>.SnapshotBase> InterfaceC33721OooO0o<TaskState<T>> getTaskState(StorageTask<T> storageTask) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(storageTask, "<this>");
        return C25252OooO0Oo.OooO0o0(new StorageKt$taskState$1(storageTask, null));
    }

    public static final FirebaseStorage storage(Firebase firebase, String url) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(firebase, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(url, "url");
        FirebaseStorage firebaseStorage = FirebaseStorage.getInstance(url);
        kotlin.jvm.internal.OooOOO0.OooO0o(firebaseStorage, "getInstance(...)");
        return firebaseStorage;
    }

    public static final StorageMetadata storageMetadata(InterfaceC32507OooOO0o<? super StorageMetadata.Builder, C32460OooOooO> init) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(init, "init");
        StorageMetadata.Builder builder = new StorageMetadata.Builder();
        init.invoke(builder);
        StorageMetadata storageMetadataBuild = builder.build();
        kotlin.jvm.internal.OooOOO0.OooO0o(storageMetadataBuild, "build(...)");
        return storageMetadataBuild;
    }

    public static final long component1(StreamDownloadTask.TaskSnapshot taskSnapshot) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(taskSnapshot, "<this>");
        return taskSnapshot.getBytesTransferred();
    }

    public static final long component2(StreamDownloadTask.TaskSnapshot taskSnapshot) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(taskSnapshot, "<this>");
        return taskSnapshot.getTotalByteCount();
    }

    public static final InputStream component3(StreamDownloadTask.TaskSnapshot taskSnapshot) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(taskSnapshot, "<this>");
        InputStream stream = taskSnapshot.getStream();
        kotlin.jvm.internal.OooOOO0.OooO0o(stream, "getStream(...)");
        return stream;
    }

    public static final FirebaseStorage storage(Firebase firebase, FirebaseApp app) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(firebase, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(app, "app");
        FirebaseStorage firebaseStorage = FirebaseStorage.getInstance(app);
        kotlin.jvm.internal.OooOOO0.OooO0o(firebaseStorage, "getInstance(...)");
        return firebaseStorage;
    }

    public static final long component1(FileDownloadTask.TaskSnapshot taskSnapshot) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(taskSnapshot, "<this>");
        return taskSnapshot.getBytesTransferred();
    }

    public static final long component2(FileDownloadTask.TaskSnapshot taskSnapshot) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(taskSnapshot, "<this>");
        return taskSnapshot.getTotalByteCount();
    }

    public static final String component3(ListResult listResult) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(listResult, "<this>");
        return listResult.getPageToken();
    }

    public static final FirebaseStorage storage(Firebase firebase, FirebaseApp app, String url) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(firebase, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(app, "app");
        kotlin.jvm.internal.OooOOO0.OooO0oO(url, "url");
        FirebaseStorage firebaseStorage = FirebaseStorage.getInstance(app, url);
        kotlin.jvm.internal.OooOOO0.OooO0o(firebaseStorage, "getInstance(...)");
        return firebaseStorage;
    }

    public static final List<StorageReference> component1(ListResult listResult) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(listResult, "<this>");
        List<StorageReference> items = listResult.getItems();
        kotlin.jvm.internal.OooOOO0.OooO0o(items, "getItems(...)");
        return items;
    }

    public static final List<StorageReference> component2(ListResult listResult) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(listResult, "<this>");
        List<StorageReference> prefixes = listResult.getPrefixes();
        kotlin.jvm.internal.OooOOO0.OooO0o(prefixes, "getPrefixes(...)");
        return prefixes;
    }
}
