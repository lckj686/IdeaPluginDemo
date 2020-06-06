package com.leon.demo;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

public class DemoAction extends AnAction {


    /**
     * 这个操作被点击
     * @param e
     */
    @Override
    public void actionPerformed(AnActionEvent e) {
        Messages.showDialog("helloWord", "警告", new String[]{}, 0, Messages.getQuestionIcon());
    }
}
