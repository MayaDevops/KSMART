<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ include file="/includes/taglibs.jsp"%>
<form:form role="form" action="../update"
	modelAttribute="transactionSummary" id="transactionSummaryform"
	cssClass="form-horizontal form-groups-bordered"
	enctype="multipart/form-data">
	<%@ include file="transactionsummary-form.jsp"%>
	<input type="hidden" name="transactionSummary"
		value="${transactionSummary.id}" />
	</div>
	</div>
	</div>
	</div>
	<div class="form-group">
		<div class="text-center">
			<button type='submit' class='btn btn-primary' id="buttonSubmit">
				<spring:message code='lbl.update' />
			</button>
			<a href='javascript:void(0)' class='btn btn-default'
				onclick='self.close()'><spring:message code='lbl.close' /></a>
		</div>
	</div>
</form:form>
<script>
	$('#buttonSubmit').click(function(e) {
		if ($('form').valid()) {
		} else {
			e.preventDefault();
		}
	});
</script>