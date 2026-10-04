package com.google.firebase.sessions;

import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import android.os.Process;
import com.google.firebase.sessions.ProcessDataManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;
import oO00ooO.InterfaceC32440OooOO0;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.Oooo0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u00122\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u001b\u0010\"\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010$\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010*\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010!R\u001b\u0010.\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, m80612d2 = {"Lcom/google/firebase/sessions/ProcessDataManagerImpl;", "Lcom/google/firebase/sessions/ProcessDataManager;", "Landroid/content/Context;", "appContext", "Lcom/google/firebase/sessions/UuidGenerator;", "uuidGenerator", "<init>", "(Landroid/content/Context;Lcom/google/firebase/sessions/UuidGenerator;)V", "", "Lcom/google/firebase/sessions/ProcessDetails;", "getAppProcessDetails", "()Ljava/util/List;", "processDetails", "Lcom/google/firebase/sessions/ProcessData;", "processData", "", "isProcessStale", "(Lcom/google/firebase/sessions/ProcessDetails;Lcom/google/firebase/sessions/ProcessData;)Z", "", "", "processDataMap", "isColdStart", "(Ljava/util/Map;)Z", "isMyProcessStale", "LoO00ooO/OooOooO;", "onSessionGenerated", "()V", "updateProcessDataMap", "(Ljava/util/Map;)Ljava/util/Map;", "Landroid/content/Context;", "myProcessName$delegate", "LoO00ooO/OooOO0;", "getMyProcessName", "()Ljava/lang/String;", "myProcessName", "", "myPid", "I", "getMyPid", "()I", "myUuid$delegate", "getMyUuid", "myUuid", "myProcessDetails$delegate", "getMyProcessDetails", "()Lcom/google/firebase/sessions/ProcessDetails;", "myProcessDetails", "hasGeneratedSession", "Z", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class ProcessDataManagerImpl implements ProcessDataManager {
    private final Context appContext;
    private boolean hasGeneratedSession;
    private final int myPid;

    /* JADX INFO: renamed from: myProcessDetails$delegate, reason: from kotlin metadata */
    private final InterfaceC32440OooOO0 myProcessDetails;

    /* JADX INFO: renamed from: myProcessName$delegate, reason: from kotlin metadata */
    private final InterfaceC32440OooOO0 myProcessName;

    /* JADX INFO: renamed from: myUuid$delegate, reason: from kotlin metadata */
    private final InterfaceC32440OooOO0 myUuid;

    public ProcessDataManagerImpl(Context appContext, UuidGenerator uuidGenerator) {
        OooOOO0.OooO0oO(appContext, "appContext");
        OooOOO0.OooO0oO(uuidGenerator, "uuidGenerator");
        this.appContext = appContext;
        int i = 0;
        this.myProcessName = C20519OooO0Oo.OooO0OO(new C22800OooO0oo(this, i));
        this.myPid = Process.myPid();
        this.myUuid = C20519OooO0Oo.OooO0OO(new OooO(uuidGenerator, i));
        this.myProcessDetails = C20519OooO0Oo.OooO0OO(new OooOO0(this, 0));
    }

    private final List<ProcessDetails> getAppProcessDetails() {
        return ProcessDetailsProvider.INSTANCE.getAppProcessDetails(this.appContext);
    }

    private final ProcessDetails getMyProcessDetails() {
        return (ProcessDetails) this.myProcessDetails.getValue();
    }

    private final boolean isProcessStale(ProcessDetails processDetails, ProcessData processData) {
        return OooOOO0.OooO0O0(getMyProcessName(), processDetails.getProcessName()) ? (processDetails.getPid() == processData.getPid() && OooOOO0.OooO0O0(getMyUuid(), processData.getUuid())) ? false : true : processDetails.getPid() != processData.getPid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProcessDetails myProcessDetails_delegate$lambda$2(ProcessDataManagerImpl processDataManagerImpl) {
        return ProcessDetailsProvider.INSTANCE.getMyProcessDetails(processDataManagerImpl.appContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String myProcessName_delegate$lambda$0(ProcessDataManagerImpl processDataManagerImpl) {
        return processDataManagerImpl.getMyProcessDetails().getProcessName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String myUuid_delegate$lambda$1(UuidGenerator uuidGenerator) {
        String string = uuidGenerator.next().toString();
        OooOOO0.OooO0o(string, "toString(...)");
        return string;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public Map<String, ProcessData> generateProcessDataMap() {
        return ProcessDataManager.DefaultImpls.generateProcessDataMap(this);
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public int getMyPid() {
        return this.myPid;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public String getMyProcessName() {
        return (String) this.myProcessName.getValue();
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public String getMyUuid() {
        return (String) this.myUuid.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.sessions.ProcessDataManager
    public boolean isColdStart(Map<String, ProcessData> processDataMap) {
        OooOOO0.OooO0oO(processDataMap, "processDataMap");
        if (this.hasGeneratedSession) {
            return false;
        }
        List<ProcessDetails> appProcessDetails = getAppProcessDetails();
        ArrayList<C32443OooOOO> arrayList = new ArrayList();
        for (ProcessDetails processDetails : appProcessDetails) {
            ProcessData processData = processDataMap.get(processDetails.getProcessName());
            C32443OooOOO c32443OooOOO = processData != null ? new C32443OooOOO(processDetails, processData) : null;
            if (c32443OooOOO != null) {
                arrayList.add(c32443OooOOO);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        for (C32443OooOOO c32443OooOOO2 : arrayList) {
            if (!isProcessStale((ProcessDetails) c32443OooOOO2.f116638OooOo0o, (ProcessData) c32443OooOOO2.f116637OooOo)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public boolean isMyProcessStale(Map<String, ProcessData> processDataMap) {
        OooOOO0.OooO0oO(processDataMap, "processDataMap");
        ProcessData processData = processDataMap.get(getMyProcessName());
        return (processData != null && processData.getPid() == getMyPid() && OooOOO0.OooO0O0(processData.getUuid(), getMyUuid())) ? false : true;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public void onSessionGenerated() {
        this.hasGeneratedSession = true;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public Map<String, ProcessData> updateProcessDataMap(Map<String, ProcessData> processDataMap) {
        if (processDataMap == null) {
            return Oooo0.OooO0o0(new C32443OooOOO(getMyProcessName(), new ProcessData(Process.myPid(), getMyUuid())));
        }
        LinkedHashMap linkedHashMapOooOOOO = C34444Oooo0O0.OooOOOO(processDataMap);
        linkedHashMapOooOOOO.put(getMyProcessName(), new ProcessData(Process.myPid(), getMyUuid()));
        return C34444Oooo0O0.OooOOO0(linkedHashMapOooOOOO);
    }
}
