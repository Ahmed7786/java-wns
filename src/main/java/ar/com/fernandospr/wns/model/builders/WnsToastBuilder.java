package ar.com.fernandospr.wns.model.builders;

import ar.com.fernandospr.wns.model.WnsAudio;
import ar.com.fernandospr.wns.model.WnsBinding;
import ar.com.fernandospr.wns.model.WnsToast;
import ar.com.fernandospr.wns.model.WnsVisual;
import ar.com.fernandospr.wns.model.types.WnsToastTemplate;

public class WnsToastBuilder extends WnsAbstractBuilder<WnsToastBuilder> {
	private WnsToast toast;
	
	public WnsToastBuilder() {
		this.toast = new WnsToast();
	}
	
	@Override
	public WnsToastBuilder getThis() {
		return this;
	}
	
	@Override
	protected WnsVisual getVisual() {
		if (this.toast.visual == null) {
			this.toast.visual = new WnsVisual();
		}
		return this.toast.visual;
	}
	
	@Override
	protected WnsBinding getBinding() {
		if (getVisual().binding == null) {
			getVisual().binding = new WnsBinding();
		}
		return this.toast.visual.binding;
	}
	
	protected WnsAudio getAudio() {
		if (this.toast.audio == null) {
			this.toast.audio = new WnsAudio();
		}
		return this.toast.audio;
	}
	
	public WnsToastBuilder launch(String launch) {
		this.toast.launch = launch;
		return this;
	}
	
	/**
	 * @param duration should be any of {@link ar.com.fernandospr.wns.model.types.WnsToastDuration}
	 */
	public WnsToastBuilder duration(String duration) {
		this.toast.duration = duration;
		return this;
	}
	
	public WnsToastBuilder bindingTemplateToastText01(String textField1) {
		return this.bindingTemplate(WnsToastTemplate.TOASTTEXT01)
					.setBindingTextFields(textField1);
	}
	
	public WnsToastBuilder bindingTemplateToastText02(String textField1, String textField2) {
		return this.bindingTemplate(WnsToastTemplate.TOASTTEXT02)
					.setBindingTextFields(textField1, textField2);
	}
	
	public WnsToastBuilder bindingTemplateToastText03(String textField1, String textField2) {
		return this.bindingTemplate(WnsToastTemplate.TOASTTEXT03)
					.setBindingTextFields(textField1, textField2);
	}
	
	public WnsToastBuilder bindingTemplateToastText04(String textField1, String textField2, String textField3) {
		return this.bindingTemplate(WnsToastTemplate.TOASTTEXT04)
					.setBindingTextFields(textField1, textField2, textField3);
	}
	
	public WnsToastBuilder bindingTemplateToastImageAndText01(String imgSrc1, String textField1) {
		return this.bindingTemplate(WnsToastTemplate.TOASTIMAGEANDTEXT01)
					.setBindingTextFields(textField1)
					.setBindingImages(imgSrc1);
	}
	
	public WnsToastBuilder bindingTemplateToastImageAndText02(String imgSrc1, String textField1, String textField2) {
		return this.bindingTemplate(WnsToastTemplate.TOASTIMAGEANDTEXT02)
					.setBindingTextFields(textField1, textField2)
					.setBindingImages(imgSrc1);
	}
	
	public WnsToastBuilder bindingTemplateToastImageAndText03(String imgSrc1, String textField1, String textField2) {
		return this.bindingTemplate(WnsToastTemplate.TOASTIMAGEANDTEXT03)
					.setBindingTextFields(textField1, textField2)
					.setBindingImages(imgSrc1);
	}
	
	public WnsToastBuilder bindingTemplateToastImageAndText04(String imgSrc1, String textField1, String textField2, String textField3) {
		return this.bindingTemplate(WnsToastTemplate.TOASTIMAGEANDTEXT04)
					.setBindingTextFields(textField1, textField2, textField3)
					.setBindingImages(imgSrc1);
	}
	
	/**
	 * @param audioSrc should be any of {@link ar.com.fernandospr.wns.model.types.WnsToastSoundSource}
	 */
	public WnsToastBuilder audioSrc(String audioSrc) {
		getAudio().src = audioSrc;
		return this;
	}
	
	public WnsToastBuilder audioLoop(Boolean loop) {
		getAudio().loop = loop;
		return this;
	}
	
	public WnsToastBuilder audioSilent(Boolean silent) {
		getAudio().silent = silent;
		return this;
	}
	
	public WnsToast build() {
		return this.toast;
	}
}