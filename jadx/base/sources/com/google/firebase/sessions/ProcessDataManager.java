package com.google.firebase.sessions;

import java.util.Map;
import kotlin.Metadata;
import oOo000Oo.C34436OooOoOO;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u001a"}, m80612d2 = {"Lcom/google/firebase/sessions/ProcessDataManager;", "", "", "", "Lcom/google/firebase/sessions/ProcessData;", "processDataMap", "", "isColdStart", "(Ljava/util/Map;)Z", "isMyProcessStale", "LoO00ooO/OooOooO;", "onSessionGenerated", "()V", "updateProcessDataMap", "(Ljava/util/Map;)Ljava/util/Map;", "generateProcessDataMap", "()Ljava/util/Map;", "getMyProcessName", "()Ljava/lang/String;", "myProcessName", "", "getMyPid", "()I", "myPid", "getMyUuid", "myUuid", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public interface ProcessDataManager {

    @Metadata(m80613k = 3, m80614mv = {2, 0, 0}, m80616xi = 48)
    public static final class DefaultImpls {
        public static Map<String, ProcessData> generateProcessDataMap(ProcessDataManager processDataManager) {
            return processDataManager.updateProcessDataMap(C34436OooOoOO.f123455OooOo0o);
        }
    }

    Map<String, ProcessData> generateProcessDataMap();

    int getMyPid();

    String getMyProcessName();

    String getMyUuid();

    boolean isColdStart(Map<String, ProcessData> processDataMap);

    boolean isMyProcessStale(Map<String, ProcessData> processDataMap);

    void onSessionGenerated();

    Map<String, ProcessData> updateProcessDataMap(Map<String, ProcessData> processDataMap);
}
