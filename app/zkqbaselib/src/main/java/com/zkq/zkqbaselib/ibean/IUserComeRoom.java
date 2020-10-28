package com.zkq.zkqbaselib.ibean;

public class IUserComeRoom {

    private boolean result;
    private int status;
    private String nodeId;
    private String msg;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "IUserComeRoom{" +
                "result=" + result +
                ", status=" + status +
                ", nodeId='" + nodeId + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
